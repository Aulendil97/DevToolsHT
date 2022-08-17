import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    @FindBy(xpath = "//input[@type='email']")
    private WebElement EmailField;

    @FindBy(css = "#identifierNext")
    private WebElement NextButtonForEmail;

    @FindBy(name = "password")
    private WebElement PassField;

    @FindBy(id = "passwordNext")
    private WebElement NextButtonForPass;


    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void sendKeysToEmailField(String keyword) {
        waitForPageLoadComplete(10);
        waitVisibilityOfElement(5, EmailField);
        EmailField.click();
        EmailField.sendKeys(keyword);
        waitVisibilityOfElement(5, NextButtonForEmail);
        NextButtonForEmail.click();
    }
    public void sendKeysToPassField(String keyword){
        waitForPageLoadComplete(10);
        waitVisibilityOfElement(5, PassField);
        PassField.click();
        PassField.sendKeys(keyword);
        waitVisibilityOfElement(5,NextButtonForPass);
        NextButtonForPass.click();
    }

}
