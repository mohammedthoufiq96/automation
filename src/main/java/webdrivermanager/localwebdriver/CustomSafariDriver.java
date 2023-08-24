package webdrivermanager.localwebdriver;

import io.github.bonigarcia.wdm.managers.SafariDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CustomSafariDriver {
    public CustomSafariDriver() {
        this.setupClass();
    }
    public void setupClass() {
        SafariDriverManager.safaridriver().setup();
    }

    public WebDriver getDriver() throws InterruptedException {
        return new SafariDriver();
    }
}
