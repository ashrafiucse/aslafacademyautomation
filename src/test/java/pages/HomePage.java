package pages;

import config.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Setup {
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='https://aslaf.figlab.co']")
    WebElement logo;

    @FindBy(xpath = "//a[@href='https://aslaf.figlab.co/all-courses']")
    WebElement allCourseLink;

    @FindBy(className = "leading-normal")
    List<WebElement> courseCard;

    @FindBy(xpath = "//a[contains(text(),'কোর্সটি কিনুন')]")
    WebElement buyCourseButton;

    @FindBy(xpath = "//a[@href='https://aslaf.figlab.co/checkout']")
    WebElement checkOutButton;

    @FindBy(xpath = "//input[@placeholder='এখানে লিখুন']")
    WebElement couponCodeField;

    @FindBy(xpath = "//button[@type='button']")
    WebElement couponCodeApplyButton;

    @FindBy(className = "mr-2")
    List<WebElement> paymentSystemRadioButton; //1

    @FindBy(className = "btn-primary")
    List<WebElement> confirmButton; //4

    public void enrollCourse() {
        logo.click();
        allCourseLink.click();
    }
}
