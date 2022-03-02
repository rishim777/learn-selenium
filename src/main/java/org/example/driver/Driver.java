package org.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver implements DriverInterface{

    @Override
    public WebDriver getFirefoxDriver() {
//        FirefoxOptions options=new FirefoxOptions();
//        options.setBinary("/usr/bin/firefox");
//        return new FirefoxDriver(options);
        return new FirefoxDriver();
    }

    @Override
    public WebDriver getBraveDriver() {
        ChromeOptions options=new ChromeOptions();
        options.setBinary("/usr/bin/brave-browser");
        return new ChromeDriver(options);
    }

    @Override
    public WebDriver getChromeDriver() {
        ChromeOptions options=new ChromeOptions();
        options.setBinary("/usr/bin/google-chrome");
        return new ChromeDriver(options);
    }
}
