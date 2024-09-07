package steps;

import component.WinDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class FirstNumber extends WinDriver {

    private final WinDriver winDriver;

    public FirstNumber(WinDriver driver){
        this.winDriver = driver;
    }

    @When("the user enters number {string}")
    public void userEnterFirst(String number) {
        winDriver.getWindowsDriver().findElement(By.name(number)).click();
    }
}
