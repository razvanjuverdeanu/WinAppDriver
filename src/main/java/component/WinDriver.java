package component;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WinDriver {
    private WindowsDriver windowsDriver;

    public WinDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app", "C:\\Windows\\System32\\calc.exe");
        desiredCapabilities.setCapability("platformName", "Windows");
        desiredCapabilities.setCapability("deviceName", "winPC");
        desiredCapabilities.setCapability("ms:waitForAppLaunch", "5");

        try {
            windowsDriver = new WindowsDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);
        }catch (Exception e){
            e.printStackTrace();
        }

        windowsDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WindowsDriver getWindowsDriver (){
        return windowsDriver;
    }
}
