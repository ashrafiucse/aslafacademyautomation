package testRunner;

import config.Setup;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SettingPage;

public class UpdateProfileDetailRunner extends Setup {


    @Test
    public void doLogIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("ashrafqa.office@gmail.com","1234567890");
    }

    @Test
    public void updateProfile() throws InterruptedException {
        SettingPage settingPage = new SettingPage(driver);
        settingPage.goToSettingPage();
        settingPage.changeProfileDetail("Ashraf","ashrafqa.office@gmail.com");
    }
//    @Test
//    public void updateProfile() throws InterruptedException {
//        SettingPage settingPage = new SettingPage(driver);
//        settingPage.changeProfileDetail("Ashraf","ashrafqa.office@gmail.com");
//    }

//    @Test
//    public void changePassword() throws InterruptedException {
//        SettingPage settingPage = new SettingPage(driver);
//        settingPage.changePasswordValue("123456789");
//    }
}
