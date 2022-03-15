package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumQA\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.rediff.com/");

        //Thread.sleep(3000);
        /* CssSelector expression is use the class attribute*/
        driver.findElement(By.cssSelector("a[class=signin")).click();
       // Thread.sleep(3000);
        /* CssSelector expression is use the ID attribute*/
        driver.findElement(By.cssSelector("#login1")).sendKeys("vishalrathod2907");

        driver.findElement(By.cssSelector("#password")).sendKeys("Vijay@7038");
        Thread.sleep(2000);

        /* CssSelector expression is use the Type attribute*/
        driver.findElement(By.cssSelector(" input[type=submit]")).click();

        /* CssSelector expression is use the Value attribute*/
        //driver.findElement(By.cssSelector("input[value=Sign in]")).click();
        Thread.sleep(3000);
        driver.close();
    }
}