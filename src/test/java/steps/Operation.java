package steps;

import component.WinDriver;
import io.cucumber.java.en.When;
import utils.Helper;
import utils.Operations;

public class Operation extends WinDriver {

    private final WinDriver winDriver;
    private final Helper helper;

    public Operation(WinDriver driver, Helper helper) {
        this.winDriver = driver;
        this.helper = helper;
    }

    @When("the user presses on the {string} sign")
    public void pressSign(String sign) {

        helper.op = Operations.valueOf(helper.transformSignForInspectElement(sign));
        winDriver.getWindowsDriver().findElementByAccessibilityId(helper.transformSignForInspectElement(sign)).click();
    }
}
