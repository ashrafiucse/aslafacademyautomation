package testRunner;

import config.Setup;
import org.testng.annotations.Test;
import pages.HomePage;

public class AboutPageRunner extends Setup {
    @Test
    public void goToAboutPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.goToAboutPage();
    }
}
