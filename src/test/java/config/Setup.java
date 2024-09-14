package config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.Driver;
import java.time.Duration;

public class Setup {
    public WebDriver driver;
    @BeforeSuite
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://aslaf.figlab.co/");
    }
    @AfterSuite
    public void quit() {
        driver.quit();
    }
}
