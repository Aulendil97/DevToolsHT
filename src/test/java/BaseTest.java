import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;
    private static final String GMAIL_URL = "https://www.gmail.com/";


    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(GMAIL_URL);
    }

     @AfterMethod
     public void tearDown() {
           driver.close();
     }

    public WebDriver getDriver() {
        return driver;
    }

    public LogInPage getLogInPage() {
        return new LogInPage(getDriver());
    }
    public InBoxPage getInBoxPage() {
        return new InBoxPage(getDriver());
    }

}
