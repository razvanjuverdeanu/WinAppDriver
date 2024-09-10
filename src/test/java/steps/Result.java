package steps;

import component.WinDriver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import utils.Helper;

import static org.testng.Assert.assertEquals;

public class Result extends WinDriver {

    private final WinDriver winDriver;
    private final Helper helper;

    public Result(WinDriver driver, Helper helper) {
        this.winDriver = driver;
        this.helper = helper;
    }

    @Then("the result is as expected")
    public void checkResult() {
        winDriver.getWindowsDriver().findElement(By.name("Equals")).click();
        String displayedResult = winDriver.getWindowsDriver().findElementByAccessibilityId("CalculatorResults").getText();

        // taking the actual displayedResult number and format it
        String[] actualResultNumber = displayedResult.split(" ");
        String actualFormattedNumber = helper.formatToTwoDecimal(actualResultNumber[actualResultNumber.length-1]);

        // computing expected displayedResult and format it
        String expected = helper.calculateOperation(helper.firstNumber, helper.secondNumber, helper.op);
        String expectedFormattedNumber = helper.formatToTwoDecimal(expected);

        assertEquals(actualFormattedNumber, expectedFormattedNumber);

        winDriver.getWindowsDriver().findElementByAccessibilityId("Close").click();
    }
}
