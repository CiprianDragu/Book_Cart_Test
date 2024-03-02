package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Constants;
import java.util.List;
public class HomePage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement login;
    @FindBy(xpath = "//span[contains(text(),'Register')]")
    WebElement register;
    @FindBy(css = "#mat-input-2")
    WebElement firstName;
    @FindBy(css = "#mat-input-3")
    WebElement lastName;
    @FindBy(css = "#mat-input-4")
    WebElement userName;
    @FindBy(css = "#mat-input-5")
    WebElement password;
    @FindBy(css = "#mat-input-6")
    WebElement confirmPassword;
    @FindBy(css = "#mat-radio-2")
    WebElement gender;
    @FindBy(xpath = "//span[contains(text(),'Register')]")
    WebElement reg;
    @FindBy(xpath = "//h3[contains(text(),'Login')]")
    WebElement textLogin;
    @FindBy(xpath = "//span[contains(text(),'mihutc321')]")
    WebElement idName;
    @FindBy(css = "button.mat-focus-indicator:nth-child(3)")
    WebElement pressUserName;
    @FindBy(css = "button.mat-menu-item:nth-child(2)")
    WebElement pressLogOut;
    @FindBy(xpath = "//a[contains(text(),'All Categories')]")
    WebElement colorOrange;
    @FindBy(xpath = "//h4[contains(text(),'Price Filter')]")
    WebElement pFilterColor;
    @FindBy(xpath = "//a[contains(text(),'Biography')]")
    WebElement biography;
    @FindBy(xpath = "//a[contains(text(),'Fiction')]")
    WebElement fiction;
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement selectFirstBook;
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[8]")
    WebElement selectSecondBook;
    @FindBy(xpath = "//a[contains(text(),'Mystery')]")
    WebElement selectMystery;
    @FindBy(xpath = "(//img[@class='mat-card-image preview-image'])[2]")
    WebElement clickSelectHP5;
    @FindBy(xpath = "(//img[@class='mat-card-image preview-image'])[1]")
    WebElement moveToHP5;
    @FindBy(xpath = "//span[contains(text(),' Book Cart')]")
    WebElement backToAllCategories;
    @FindBy(xpath = "(//mat-icon[contains(text(),'shopping_cart')])[1]")
    WebElement cartButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        login.click();
    }

    public void userRegistration() {
        register.click();
    }

    public void inputFirstName() {
        firstName.sendKeys(Constants.FIRST_NAME);
    }

    public void inputLastName() {
        lastName.sendKeys(Constants.LAST_NAME);
    }

    public void inputUserName() {
        userName.sendKeys(Constants.REGISTER_USER_NAME);
    }

    public void inputPassword() {
        password.sendKeys(Constants.PASSWORD1);
    }

    public void inputConfirmPassword() {
        confirmPassword.sendKeys(Constants.CONFIRM_PASSWORD);
    }

    public void genderOption() {
        gender.click();
    }

    public void registerButton() {
        scrollToElement(reg);
        reg.click();
    }

    public String getLoginMessage() {
        return textLogin.getText();
    }

    public String getUserNameText() {
        return idName.getText();
    }

    public void pressUserNameButton() {
        pressUserName.click();
    }

    public void logOutButton() {
        pressLogOut.click();
    }

    public void clickCategoryButton() {
        colorOrange.click();
    }

    public void verifyPriceFilterColor() {
        pFilterColor.click();
    }

    public void clickBiographyCategory() {
        biography.click();
    }

    public void listOfBiographyBooks() {
        boolean itsClicked = false;
        List<WebElement> books = driver.findElements(By.xpath("//span[contains(text(),' Add to Cart')]"));
        int size = books.size();
        for (int i = 0; i < size; i++) {
            itsClicked = books.get(i).isSelected();
            if (!itsClicked) {
                books.get(i).click();
            }
        }
    }

    public void clickFictionCategory() {
        fiction.click();
    }

    public void clickFirstBook() {
        selectFirstBook.click();
    }

    public void clickSecondBook() {
        scrollToElement(selectSecondBook);
        selectSecondBook.click();
    }

    public void clickMysteryCategory() {
        selectMystery.click();

    }

    public void selectHarryPotter5() {
        clickSelectHP5.click();
    }

    public void moveToHarryPotter5() {
        moveTheMouse(moveToHP5);
    }

    public void backToHomePage() {
        backToAllCategories.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }
}