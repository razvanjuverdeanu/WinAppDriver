package steps;

import component.WinDriver;
import io.cucumber.java.en.When;
import utils.Helper;

public class FirstNumber extends WinDriver {

    private final WinDriver winDriver;

    private final Helper helper;

    public FirstNumber(WinDriver driver, Helper helper) {
        this.winDriver = driver;
        this.helper = helper;
    }

    @When("the user enters first number {string}")
    public void userEntersFirst(String number) {
        helper.firstNumber = Integer.parseInt(number);
        helper.enterCalculatorNumber(number, winDriver);

    }
}
