package steps;

import component.WinDriver;
import io.cucumber.java.en.Given;

public class OpenCalculator extends WinDriver {

    private final WinDriver winDriver;

    public OpenCalculator(WinDriver driver){
        this.winDriver = driver;
    }

    @Given("the user opens the system calculator")
    public void openCalculator() {
    }
}
