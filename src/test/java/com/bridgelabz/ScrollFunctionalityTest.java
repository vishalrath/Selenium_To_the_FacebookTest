package com.bridgelabz;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollFunctionalityTest {


    @Test
    public void scrollTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumQA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.javatpoint.com/");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

       // javascriptExecutor.executeScript("window.scrollBy(0, 1000)");
        for (int i = 1; i < 10; i++) {
      //scroll down on the webpage
            javascriptExecutor.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        driver.close();

    }

}