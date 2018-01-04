package com.company;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.SystemClock;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class form_filling {

        @Test
        public void Form1() {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");  // define driver
            ChromeDriver driver = new ChromeDriver();  // intitalize driver variable
            driver.navigate().to("http://www.practiceselenium.com/practice-form.html"); //Navigation

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // thread
            driver.findElement(By.name("firstname")).sendKeys("Shafaq");

            driver.findElement(By.name("lastname")).sendKeys("Zehra");

            driver.findElement(By.id("sex-1")).click();

            driver.findElement(By.id("exp-2")).click();

            driver.findElement(By.id("datepicker")).sendKeys("12/12/2017");

            driver.findElement(By.id("tea2")).click();

            driver.findElement(By.id("tool-0")).click();


            driver.findElement(By.id("continents")).click();

            driver.findElement(By.id("selenium_commands")).click();
            driver.findElement(By.id("submit")).click();

            // Select.dropdown = new Select(driver.findElement(By.id("Continents")));
            // dropdown.selectByIndex(1);

            // Select.dropdown = new Select(driver.findElement(By.id("selenium_commands")));
            // dropdown.selectByIndex(1);

            String URL = driver.getCurrentUrl();
            String path = "http://www.practiceselenium.com/welcome.html?firstname=Shafaq&lastname=Zehra&sex=Female&exp=3&RedTea=Red+Tea&tool=Break&continents=USA&selenium_commands=Switch+Commands&submit=";
            Assert.assertEquals(URL, path);

        }
    }

