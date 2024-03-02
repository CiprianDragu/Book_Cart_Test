package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartItemsPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'CheckOut')]")
    WebElement checkOutButton;


    public CartItemsPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckOutButton() {
        scrollToElement(checkOutButton);
        checkOutButton.click();
    }

}
