package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDetailsPage {
    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstName_id;
    @FindBy(id = "last-name")
    WebElement lastName_id;
    @FindBy(id = "postal-code")
    WebElement postalCode_id;
    @FindBy(id = "continue")
    WebElement continueButton_id;

    @FindBy(id = "cancel") WebElement cancelButton_id;

    public UserDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        firstName_id.sendKeys(firstName);
    }
    public void enterSurname(String lastName) {
        lastName_id.sendKeys(lastName);
    }
    public void enterPostalCode(String postalCode) {
        postalCode_id.sendKeys(postalCode);
    }
    public void clickContinueButton() {
        continueButton_id.click();
    }
    public void clickCancelButton() {
        cancelButton_id.click();
    }

}
