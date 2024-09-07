package steps;

import component.WinDriver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Operation extends WinDriver{

    private final WinDriver winDriver;

    public Operation(WinDriver driver){
        this.winDriver = driver;
    }

    @When("the user presses on the + sign")
    public void pressSign(String sign) {
        winDriver.getWindowsDriver().findElement(By.name(sign)).click();
    }
}
