package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;
    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement ProductsText_xpath;
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyProductText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(ProductsText_xpath));
        ProductsText_xpath.isDisplayed();
    }
}
