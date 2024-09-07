package steps;

import component.WinDriver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Result extends WinDriver{

    private final WinDriver winDriver;

    public Result(WinDriver driver){
        this.winDriver = driver;
    }

    @Then("the result is as expected")
    public void checkResult() {
        winDriver.getWindowsDriver().findElement(By.name("=")).click();
        String res =  winDriver.getWindowsDriver().findElementByAccessibilityId("CalculatorResults").getText();
    }
}
