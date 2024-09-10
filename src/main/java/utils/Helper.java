package utils;

import component.WinDriver;
import org.openqa.selenium.By;

import java.text.DecimalFormat;

public class Helper {
    public int firstNumber;
    public int secondNumber;
    public Operations op;

    public String transformSignForInspectElement( String operation) {
        for (Operations op : Operations.values()) {
            if (operation.equalsIgnoreCase(op.getSign())) {
                return op.name();
            }
        }
        return "";
    }


    public String transformNumberForInspectElement(Character number) {
        return switch (number) {
            case '1' -> "One";
            case '2' -> "Two";
            case '3' -> "Three";
            case '4' -> "Four";
            case '5' -> "Five";
            case '6' -> "Six";
            case '7' -> "Seven";
            case '8' -> "Eight";
            case '9' -> "Nine";
            case '0' -> "Zero";
            default -> "";
        };
    }

    public String calculateOperation(int f, int s, Operations operations){
        float result = 0.0F;
        if(operations.getSign().equalsIgnoreCase("+")){
            result = f + s;
        }else if(operations.getSign().equalsIgnoreCase("-")){
            result = f - s;
        }else if(operations.getSign().equalsIgnoreCase("*")) {
            result = f * s;
        }else if(operations.getSign().equalsIgnoreCase("/")) {
            result = (float) f /s;
        }
        return String.valueOf(result);
    }

    public void enterCalculatorNumber(String number, WinDriver winDriver) {
        boolean isNegative = false;
        for (Character character: number.toCharArray()) {
            if ("-".equalsIgnoreCase(character.toString())) {
                isNegative = true;
            }  else {
                winDriver.getWindowsDriver().findElement(By.name(transformNumberForInspectElement(character))).click();
            }
        }
        if(isNegative){
            winDriver.getWindowsDriver().findElementByAccessibilityId("negateButton").click();
        }
    }

    public String formatToTwoDecimal(String number){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(Double.parseDouble(number));
    }


}
