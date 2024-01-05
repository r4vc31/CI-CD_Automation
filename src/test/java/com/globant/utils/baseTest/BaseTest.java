package com.globant.utils.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    String url = System.getenv("URL");

    @BeforeClass
    public void setUpBase() {
        String driverPath = "src/utils/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    @AfterClass
    public void tearDownBase() {
        // Close browser
        driver.quit();
    }

}

