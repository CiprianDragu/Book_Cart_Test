package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Constants;

public class LoginPage extends BasePage {
    @FindBy(css = "#mat-input-0")
    WebElement credentials;
    @FindBy(css = "#mat-input-1")
    WebElement loginPass;
    @FindBy(xpath = "(//span[contains(text(),'Login')])[2]")
    WebElement clickLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUserName() {
        credentials.sendKeys(Constants.LOGIN_USER_NAME);
    }

    public void inputPassword() {
        loginPass.sendKeys(Constants.PASSWORD1);
    }

    public void clickLoginButton() {
        clickLogin.click();
    }
}
