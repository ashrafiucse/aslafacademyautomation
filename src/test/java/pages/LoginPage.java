package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "স্টুডেন্ট একাউন্ট")
    WebElement studentAccountButton;

    @FindBy(name = "email")
    WebElement emailField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement logInButton;

    public void doLogin(String email, String password) {
        studentAccountButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        logInButton.click();
    }
}
