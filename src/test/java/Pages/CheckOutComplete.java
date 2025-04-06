package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CheckOutComplete {
    WebDriver driver;

    @FindBy(id = "back-to-products")
    WebElement backToProducts_id;

    public CheckOutComplete(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBackToProducts() {
        backToProducts_id.click();
    }
}
