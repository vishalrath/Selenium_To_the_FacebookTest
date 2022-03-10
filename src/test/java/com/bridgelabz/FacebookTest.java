package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumQA\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create New Account")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Vishal");
        driver.findElement(By.name("lastname")).sendKeys("Rathod");

            driver.findElement(By.name("reg_email__")).sendKeys("Rathod@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Rathod@gmail.com");

        driver.findElement(By.name("reg_passwd__")).sendKeys("TestPassword");
       driver.findElement(By.id("day")).sendKeys("29");
        driver.findElement(By.id("month")).sendKeys("jul");
        driver.findElement(By.id("year")).sendKeys("1995");

        driver.findElement(By.xpath("//input[@type='radio' and @value ='2']")).click();
         driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);

       // driver.close();


    }
}
