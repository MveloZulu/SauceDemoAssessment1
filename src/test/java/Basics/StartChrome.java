package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class StartChrome {
    WebDriver driver;

//    public StartChrome(WebDriver driver) {
//        this.driver = driver;
//    }

    @Test
    public void verifyLoginSuccess() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//span[contains(.,'Products')]")).isDisplayed();


        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("shopping_cart_container")).click();
        //Thread.sleep(2000);
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("continue-shopping")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Princess");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("Zulu");
        driver.findElement(By.id("postal-code")).sendKeys("1234");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("login-button")).isDisplayed();

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }



}
