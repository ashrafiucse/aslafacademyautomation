package testRunner;

import config.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationRunner extends Setup{
    @Test
    public void testRegistration() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.doRegistration("Ashraf Ali", "ashraf123456@gmail.com", "123456789");
        String confirmationEmailText = driver.findElement(By.xpath("//*[contains(text(),'Resend Verification Email')]")).getText();
        Assert.assertEquals("Resend Verification Email",confirmationEmailText);
    }


}
