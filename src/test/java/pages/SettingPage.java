package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SettingPage {
    WebDriver driver1;
    public SettingPage(WebDriver driver1) {
        this.driver1 = driver1;
        PageFactory.initElements(driver1,this);
    }
    @FindBy(linkText = "সেটিংস")
    WebElement settingButton;

    @FindBy(partialLinkText = "https://aslaf.figlab.co/student/edit-profile")
    WebElement editButton;

    @FindBy(name = "name")
    WebElement nameField;

    @FindBy(name = "email")
    WebElement emailField;

    @FindBy(xpath = "//button[contains(text(),'সেইভ করুন')]")
    List<WebElement> saveButton;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(name = "password_confirmation")
    WebElement confirmPasswordField;

    public void changeProfileDetail(String name, String email) {
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        saveButton.get(0).click();
    }

    public void changePassword(String password) {
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        saveButton.get(1).click();
    }

}
