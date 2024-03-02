package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOrdersPage extends BasePage {
    @FindBy(xpath = "//h2[contains(text(),'My Orders')]")
    WebElement pageLogo;


    public MyOrdersPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageLogoDisplayed() {
        return pageLogo.isDisplayed();
    }
}
