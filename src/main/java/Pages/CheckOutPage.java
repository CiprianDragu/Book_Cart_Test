package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Constants;

public class CheckOutPage extends BasePage {
    @FindBy(css = "#mat-input-2")
    WebElement nameForShipping;
    @FindBy(css = "#mat-input-3")
    WebElement nameAddress1;
    @FindBy(css = "#mat-input-4")
    WebElement nameAddress2;
    @FindBy(css = "#mat-input-5")
    WebElement pinCode;
    @FindBy(css = "#mat-input-6")
    WebElement stateName;
    @FindBy(xpath = "//span[contains(text(),'Place Order')]")
    WebElement clickPlaceOrder;


    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void inputNameShippingAddress() {
        nameForShipping.sendKeys(Constants.LAST_NAME);
    }

    public void inputSippingAddress1() {
        nameAddress1.sendKeys(Constants.ADDRESS1);
    }

    public void inputSippingAddress2() {
        nameAddress2.sendKeys(Constants.ADDRESS2);
    }

    public void inputPinCode() {
        pinCode.sendKeys(Constants.PIN);
    }

    public void inputState() {
        stateName.sendKeys(Constants.STATE);
    }

    public void placeOrderButton() {
        clickPlaceOrder.click();
    }
}
