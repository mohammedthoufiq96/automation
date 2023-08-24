package webdrivermanager.localwebdriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import static webdrivermanager.BaseWebDriver.driver;

public class CustomChromeDriver {
    public CustomChromeDriver() {
        this.setupClass();
    }
    public void setupClass() {
        ChromeDriverManager.chromedriver().setup();
    }

    public WebDriver getDriver(String browser) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless");
        options.addArguments("--whitelisted-ips");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(options);
        } else {
            System.out.println("Test Runs on remote driver using : " + browser + " container");
            try {
             driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return driver;
    }
}
