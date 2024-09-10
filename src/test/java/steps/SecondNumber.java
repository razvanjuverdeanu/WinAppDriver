package steps;

import component.WinDriver;
import io.cucumber.java.en.When;
import utils.Helper;

public class SecondNumber extends WinDriver {


    private final WinDriver winDriver;
    private final Helper helper;

    public SecondNumber(WinDriver driver, Helper helper) {
        this.winDriver = driver;
        this.helper = helper;
    }

    @When("the user enters second number {string}")
    public void userEntersSecond(String number) {
        helper.secondNumber = Integer.parseInt(number);
        helper.enterCalculatorNumber(number, winDriver);
    }
}
