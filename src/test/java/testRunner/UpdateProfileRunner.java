package testRunner;

import config.Setup;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SettingPage;

public class UpdateProfileRunner extends Setup {
    @Test
    public void doLogIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("ashrafqa.office@gmail.com","123456789");
    }

//    public void updateProfile() {
//        SettingPage settingPage = new SettingPage(driver);
//        settingPage.changeProfileDetail("Ashraf","ashraf123@gmail.com");
//    }
}
