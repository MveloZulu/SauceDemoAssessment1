package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");
    // Initialize page objects
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    AddToCartPage addToCartPage = PageFactory.initElements(driver, AddToCartPage.class);
    CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
    UserDetailsPage userDetailsPage = PageFactory.initElements(driver, UserDetailsPage.class);
    OverviewPage overviewPage = PageFactory.initElements(driver, OverviewPage.class);
    CheckOutComplete checkOutComplete = PageFactory.initElements(driver, CheckOutComplete.class);
    MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
    RemoveItem removeItem = PageFactory.initElements(driver, RemoveItem.class);

    ReadFromExcel readFromExcel;
    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    TakeScreenshots takeScreenshots = new TakeScreenshots();
}
