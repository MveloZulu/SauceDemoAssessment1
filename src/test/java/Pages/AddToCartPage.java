package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AddToCartPage {

    WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBackpack_id;

    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCartContainer_id;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartBikeLight_id;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addToCartBoltTShirt_id;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addToCartFleeceJacket_id;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAddToCartBackpackButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(addToCartBackpack_id));
        addToCartBackpack_id.click();
    }

    public void clickAddToCartBikeLightButton() {
        addToCartBikeLight_id.click();
    }

    public void clickAddToCartBoltTShirtButton() {
        addToCartBoltTShirt_id.click();
    }

    public void clickAddToCartFleeceJacketButton() {
        addToCartFleeceJacket_id.click();
    }





    public void clickShoppingCartContainer() {
        shoppingCartContainer_id.click();
    }


}
