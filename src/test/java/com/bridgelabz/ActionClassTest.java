package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.HashMap;

public class ActionClassTest {

    @Test
    public void mouseHoverTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumQA\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.istqb.in/");

        Actions actions = new Actions(driver);

        Thread.sleep(1000);

        actions.moveToElement(driver.findElement(By.linkText("FOUNDATION"))).perform();

    }



}
