package org.example.service;

import org.example.driver.Driver;
import org.example.driver.DriverInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Service implements ServiceInterface{
    private WebDriver driver;

    public Service() {
        this.driver=new Driver().getFirefoxDriver();
    }

    @Override
    public void openWebsite(String website) {
        driver.get(website);
    }

    @Override
    public void fillSearchBox(String searchEntry) {
        // document.getElementsByName("q")[0]
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        // document.getElementsByName("q")[0].value = "Sell"
        searchBox.sendKeys(searchEntry);
    }

    @Override
    public void search() {
        //searchBox.sendKeys(Keys.ENTER);
        WebElement searchButton=driver.findElements(By.name("btnK")).get(0);
        searchButton.click();
    }

    @Override
    public void clickSecondLink() {
        WebElement div=driver.findElements(By.className("yuRUbf")).get(5);
        div.click();
    }


}
