import Pages.HomePage;
import Pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Test
    public void sigInTest() {
        HomePage homePage = new HomePage(driver);
        homePage.waitInSeconds(3);
        homePage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUserName();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        loginPage.waitInSeconds(2);
        String actualText = homePage.getUserNameText();
        String expectedText = "mihutc321";
        Assertions.assertTrue(actualText.contains(expectedText));
    }

    @Test
    public void verifyElementsColorsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCategoryButton();
        String actualColor = driver.findElement(By.xpath("//a[contains(text(),'All Categories')]")).getCssValue("color");
        String expectedColor = "rgba(0, 0, 0, 0.87)";
        Assertions.assertEquals(expectedColor, actualColor);
        homePage.waitInSeconds(3);
        homePage.verifyPriceFilterColor();
        String actualBackgroundColor = driver.findElement(By.xpath("//h4[contains(text(),'Price Filter')]")).getCssValue("color");
        String expectedBackgroundColor = "rgb(255, 255, 255)";
        Assertions.assertEquals(expectedBackgroundColor, actualBackgroundColor);


    }
}
