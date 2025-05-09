package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
    WebDriver driver;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton_id;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton_id;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMenuButton() {
        menuButton_id.click();
    }
    public void clickLogoutButton() {
        logoutButton_id.click();
    }
}
