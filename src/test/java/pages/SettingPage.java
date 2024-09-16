package pages;

import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SettingPage extends Setup{
    public SettingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='https://aslaf.figlab.co/student/profile']")
    WebElement settingButton;

    @FindBy(xpath = "//*[contains(@src,'https://aslaf.figlab.co/assets/icons/profile-edit.png')]")
    WebElement editButton;

    @FindBy(name = "name")
    WebElement nameField;

    @FindBy(name = "email")
    WebElement emailField;

    @FindBy(className = "primary-gradient-bg")
    List<WebElement> saveButton;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(name = "password_confirmation")
    WebElement confirmPasswordField;

    public void goToSettingPage() throws InterruptedException {
        settingButton.click();
        editButton.click();
        Thread.sleep(5000);
    }

    public void changePasswordValue(String password) {
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        saveButton.get(1).click();
    }

    public void changeProfileDetail(String name, String email) throws InterruptedException {
        nameField.clear();
        nameField.sendKeys(name);
        emailField.clear();
        emailField.sendKeys(email);
        saveButton.get(0).click();
    }



}
