package webdrivermanager;

import org.openqa.selenium.remote.RemoteWebDriver;
import webdrivermanager.localwebdriver.CustomChromeDriver;
import webdrivermanager.localwebdriver.CustomEdgeDriver;
import webdrivermanager.localwebdriver.CustomFirefoxDriver;
import webdrivermanager.localwebdriver.CustomSafariDriver;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;

import java.net.URL;
import java.time.Duration;

public class BaseWebDriver implements DriverSource {
    public static WebDriver driver;
    public static CustomChromeDriver customChromeDriver = new CustomChromeDriver();
    public static CustomFirefoxDriver customFirefoxDriver = new CustomFirefoxDriver();
    public static CustomEdgeDriver customEdgeDriver = new CustomEdgeDriver();
    public static CustomSafariDriver customSafariDriver = new CustomSafariDriver();

    public WebDriver newDriver() {
        String browserName = System.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.out.println("Test Runs on local: " + browserName + " browser");
            try {
                driver = customChromeDriver.getDriver(browserName);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.out.println("Test Runs on local: " + browserName + " browser");
            driver = customFirefoxDriver.getDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.out.println("Test Runs on local: " + browserName + " browser");
            driver = customEdgeDriver.getDriver();
        } else if (browserName.equalsIgnoreCase("safari")) {
            System.out.println("Test Runs on local: " + browserName + " browser");
            try {
                driver = customSafariDriver.getDriver();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
