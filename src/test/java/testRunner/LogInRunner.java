package testRunner;

import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LogInRunner extends Setup {
    @Test(priority = 1, description = "Login with invalid credential")
    public void testLogInWithInvalidCredential() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("ashrafqa.office@gmail.com","1234567890");
        WebElement profilePicture = driver.findElement(By.xpath("//img[@alt='profile picture']"));
         String tagName = profilePicture.getTagName();
         Assert.assertEquals("img",tagName);
    }

    @Test(priority = 2, description = "Login with valid credential")
    public void testLogInWithValidCredential() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("ashrafqa.office@gmail.com","123456789");
        WebElement profilePicture = driver.findElement(By.xpath("//img[@alt='profile picture']"));
        String tagName = profilePicture.getTagName();
        Assert.assertEquals("img",tagName);
    }
}
