package org.example.driver;

import org.openqa.selenium.WebDriver;

public interface DriverInterface {
    WebDriver getFirefoxDriver();
    WebDriver getBraveDriver();
    WebDriver getChromeDriver();
}
