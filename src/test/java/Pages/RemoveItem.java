package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveItem {

    WebDriver driver;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeItem_id;

    @FindBy(id = "continue-shopping")
    WebElement continueShopping_id;

    public RemoveItem(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRemoveItem() {
        removeItem_id.click();
    }

    public void clickContinueShopping() {
        continueShopping_id.click();
    }
}
