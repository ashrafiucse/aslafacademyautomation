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

    @FindBy(className = "btn-wide")
    List<WebElement> buyCourseButton; //0

    @FindBy(className = "grid")
    List<WebElement> cartIcon;

    @FindBy(xpath = "//a[@href='https://aslaf.figlab.co/checkout']")
    WebElement checkOutButton;

    @FindBy(className = "appearance-none")
    List<WebElement> couponCodeField;

    @FindBy(xpath = "//button[@type='button']")
    WebElement couponCodeApplyButton;

    @FindBy(className = "mr-2")
    List<WebElement> paymentSystemRadioButton; //1

    @FindBy(className = "btn-primary")
    List<WebElement> confirmButton; //4

    @FindBy(linkText = "আমাদের সম্পর্কে")
    WebElement aboutPageLink;


    public void enrollWithCoupon(int courseIndexNumber, String couponCode) throws InterruptedException {
        logo.click();
        allCourseLink.click();
        courseCard.get(courseIndexNumber).click();
        buyCourseButton.get(2).click();
        //System.out.println(buyCourseButton.get(2).getText());
        cartIcon.get(0).click();
        checkOutButton.click();
        //System.out.println(checkOutButton.getText());
        couponCodeField.get(2).sendKeys(couponCode);
        couponCodeApplyButton.click();
        paymentSystemRadioButton.get(1).click();
        confirmButton.get(4).click();
        //Assert.assertEquals(confirmationtext,'আপনার অর্ডারটি প্রসেসিংএ আছে');
    }

    public void enrollWithoutCoupon(int courseIndexNumber) {
        logo.click();
        allCourseLink.click();
        courseCard.get(courseIndexNumber).click();
        buyCourseButton.get(2).click();
        cartIcon.get(0).click();
        checkOutButton.click();
        paymentSystemRadioButton.get(1).click();
        confirmButton.get(4).click();
    }
    public void goToAboutPage() throws InterruptedException {
        aboutPageLink.click();
        Thread.sleep(6000);
    }
}
