import Pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RegisterTest extends BaseTest {
    @Test
    public void registerNewUser() {
        HomePage homePage = new HomePage(driver);
        homePage.waitInSeconds(3);
        homePage.clickLoginButton();
        homePage.userRegistration();
        homePage.inputFirstName();
        homePage.inputLastName();
        homePage.inputUserName();
        homePage.inputPassword();
        homePage.inputConfirmPassword();
        homePage.genderOption();
        homePage.waitInSeconds(2);
        homePage.registerButton();
        homePage.waitInSeconds(3);
        String actualTitle = homePage.getLoginMessage();
        String expectedTitle = "Login";
        Assertions.assertEquals(expectedTitle, actualTitle);
        homePage.waitInSeconds(4);
    }
}

