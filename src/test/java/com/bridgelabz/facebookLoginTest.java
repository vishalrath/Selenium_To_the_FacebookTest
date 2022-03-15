package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class facebookLoginTest {
    @Test
    public void facebookLoginTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumQA\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();

        option.addArguments("--disable-notifications");
        option.addArguments("--disable-geolocation");
        option.addArguments("--ignore-certificate-errors");

        WebDriver driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("vishalrathod7038@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Vishal@7038");
        driver.findElement(By.name("login")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Vishal Rathod')]")).click();
        Thread.sleep(4000);

        driver.close();

    }
}