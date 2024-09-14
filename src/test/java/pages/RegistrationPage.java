package pages;

import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegistrationPage{
        WebDriver driver;
        public RegistrationPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver,this);
        }
        @FindBy(linkText = "স্টুডেন্ট একাউন্ট")
        WebElement studentAccountButton;

        @FindBy(linkText = "রেজিস্ট্রেশন করুন")
        WebElement registrationButton;

        @FindBy(id = "name")
        WebElement nameField;

        @FindBy(id = "email")
        WebElement emailField;

        @FindBy(id = "password")
        WebElement passwordField;

        @FindBy(id = "password_confirmation")
        WebElement confirmPasswordField;

        @FindBy(id = "terms")
        WebElement termsCheckBox;

        @FindBy(xpath = "//button[@type='submit']")
        WebElement submitButton;

        public void doRegistration(String name, String email, String password) {
            studentAccountButton.click();
            registrationButton.click();
            nameField.sendKeys(name);
            emailField.sendKeys(email);
            passwordField.sendKeys(password);
            confirmPasswordField.sendKeys(password);
            termsCheckBox.click();
            submitButton.click();
        }
}
