package component;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WinDriver {
    private WindowsDriver windowsDriver;

    public WindowsDriver getWindowsDriver() {

        if (windowsDriver == null) {
            windowsDriver = createDriver();
        }
        return windowsDriver;
    }

    private WindowsDriver createDriver(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        desiredCapabilities.setCapability("platformName", "Windows");
        desiredCapabilities.setCapability("deviceName", "winPC");
        desiredCapabilities.setCapability("ms:waitForAppLaunch", "3");

        try {
            windowsDriver = new WindowsDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }

        windowsDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return windowsDriver;
    }
}


