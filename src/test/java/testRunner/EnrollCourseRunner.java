package testRunner;

import config.Setup;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class EnrollCourseRunner extends Setup {
    @Test
    public void doLogIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("megoko3675@heweek.com","123456789");
    }

    @Test
    public void enrollInCourse() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //homePage.enrollWithCoupon(19,"AS");
        homePage.enrollWithoutCoupon(26);
    }

}
