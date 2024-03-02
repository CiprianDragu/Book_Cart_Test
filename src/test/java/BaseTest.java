import Pages.BasePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.Constants;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUP() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }


    @AfterEach
    public void closeBrowser() {
        BasePage basePage = new BasePage(driver);
        basePage.waitInSeconds(4);
       driver.close();
    }
}
