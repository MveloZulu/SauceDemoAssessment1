package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage {
    WebDriver driver;

    @FindBy (id = "checkout")
    WebElement checkoutButton_id;


    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckoutButton() {
        checkoutButton_id.click();
    }
}
