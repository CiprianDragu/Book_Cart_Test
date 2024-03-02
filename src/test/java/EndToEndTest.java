import Pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EndToEndTest extends BaseTest {
    @Test
    public void functionalityTest() {
        HomePage homePage = new HomePage(driver);
        homePage.waitInSeconds(3);
        homePage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUserName();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        loginPage.waitInSeconds(2);
        homePage.clickBiographyCategory();
        homePage.waitInSeconds(2);
        homePage.listOfBiographyBooks();
        homePage.clickFictionCategory();
        homePage.clickFirstBook();
        homePage.clickSecondBook();
        homePage.clickMysteryCategory();
        homePage.selectHarryPotter5();
        homePage.waitInSeconds(4);
        homePage.moveToHarryPotter5();
        homePage.backToHomePage();
        homePage.clickCartButton();
        homePage.waitInSeconds(4);
        CartItemsPage cartItemsPage = new CartItemsPage(driver);
        cartItemsPage.clickCheckOutButton();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.inputNameShippingAddress();
        checkOutPage.inputSippingAddress1();
        checkOutPage.inputSippingAddress2();
        checkOutPage.inputPinCode();
        checkOutPage.inputState();
        checkOutPage.placeOrderButton();
        checkOutPage.waitInSeconds(3);
        MyOrdersPage myOrdersPage = new MyOrdersPage(driver);
        Assertions.assertTrue(myOrdersPage.isPageLogoDisplayed());
        myOrdersPage.waitInSeconds(4);
        homePage.pressUserNameButton();
        homePage.logOutButton();
        homePage.waitInSeconds(4);

    }
}
