import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InBoxPage extends BasePage{

    @FindBy(xpath = "//div[@class='T-I T-I-KE L3']")
    private WebElement WriteButton;
    @FindBy(xpath = "//textarea[@aria-label='Кому']")
    private WebElement RecipientField;
    @FindBy(xpath = "//input[@aria-label='Тема']")
    private WebElement TopicField;
    @FindBy(xpath = "//div[@aria-label='Текст повідомлення']")
    private WebElement MessageField;
    @FindBy(xpath = "//*[text()='Надіслати']")
    private WebElement SendButton;
    @FindBy(xpath = "//div[@class='ah aiv aJS']")
    private WebElement PopUpUser;
    @FindBy(xpath = "//*[text()='Повідомлення надіслано']")
    private WebElement MessageSentPopup;


    public InBoxPage(WebDriver driver) {
        super(driver);
    }

    public void sendMessage(String email, String topicName, String message){
        waitVisibilityOfElement(10,WriteButton);
        WriteButton.click();
        waitVisibilityOfElement(5,RecipientField);
        RecipientField.click();
        RecipientField.sendKeys(email);
        waitVisibilityOfElement(5,PopUpUser);
        PopUpUser.click();
        TopicField.click();
        TopicField.sendKeys(topicName);
        MessageField.click();
        MessageField.sendKeys(message);
        SendButton.click();
    }
    public boolean checkThatMessageWasSent(){
        waitVisibilityOfElement(5,MessageSentPopup);
        return MessageSentPopup.isDisplayed();
    }
}
