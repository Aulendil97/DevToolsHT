import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ImgSearchTest extends BaseTest {
    private String TestMailEmail1 = "testmailforht1@gmail.com";
    private String TestMailEmail2 = "testmailforht2@gmail.com";
    private  String TestMailPassword = "qwertyasdfg1!";

    private String TopicOfMessage = "Just for test";
    private String Message = "Hello this message just for test";

    @Test
    public void checkThatImgSearchDisplayResult() {
        getLogInPage().sendKeysToEmailField(TestMailEmail1);
        getLogInPage().sendKeysToPassField(TestMailPassword);
        getInBoxPage().sendMessage(TestMailEmail2, TopicOfMessage, Message);
        assertTrue(getInBoxPage().checkThatMessageWasSent());
    }
}
