package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkTest {
    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumQA\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.rediff.com/");

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[class=signin")).click();
        //driver.findElement(By.linkText("Sign in")).click();

       driver.findElement(By.name("login")).sendKeys("vishalrathod2907");
        driver.findElement(By.name("passwd")).sendKeys("Vijay@7038");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("rd_logout")).click();
        Thread.sleep(2000);

        /*LinkText locator should be used when the text of the link is constant
        * These locators are used to identify link type of elements only.
         */
        //driver.findElement(By.linkText("Rediff Home")).click();
        //+Thread.sleep(2000);

        /*PartialLinkText locator should be used when certain part of the link text is getting changed everytime
           the page is loaded. i.e for partially dynamically changing text, we use partialLinkText locator*/
        /* PartialLinkText are used to identify only the links present on the
        webpage.(elements whose tagname is “a” -- a stands for anchor)*/

        driver.findElement(By.partialLinkText("Rediff Ho")).click();
        Thread.sleep(2000);

        driver.close();
    }

    }
