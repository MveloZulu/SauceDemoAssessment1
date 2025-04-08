package Tests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class PurchaseItemTests extends Base {

    public void enterUsernameTests() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.enterPassword(readFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() throws InterruptedException {
        Thread.sleep(1000);
        takeScreenshots.takeSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        takeScreenshots.takeSnapShot(driver, "Landing Page");
        landingPage.verifyProductText();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addItemsToCartTests() throws InterruptedException {
        Thread.sleep(1000);
        //takeScreenshots.takeSnapShot(driver, "Add Items to Cart Page");
        addToCartPage.clickAddToCartBackpackButton();

    }

    @Test(dependsOnMethods = "addItemsToCartTests")
    public void clickShoppingCartContainerTests() throws InterruptedException {
        Thread.sleep(1000);
        takeScreenshots.takeSnapShot(driver, "Add Items to Cart Page");
        addToCartPage.clickShoppingCartContainer();
    }

    @Test(dependsOnMethods = "clickShoppingCartContainerTests")
    public void clickRemoveItemTests() throws InterruptedException {
        Thread.sleep(1000);
        takeScreenshots.takeSnapShot(driver, "Remove Item Page");
        removeItem.clickRemoveItem();
    }

    @Test(dependsOnMethods = "clickRemoveItemTests")
    public void clickContinueShoppingTests() throws InterruptedException {
        Thread.sleep(1000);
        takeScreenshots.takeSnapShot(driver, "Continue Shopping Page");
        removeItem.clickContinueShopping();
    }

    @Test(dependsOnMethods = "clickContinueShoppingTests")
    public void addItemsToCartTests2() throws InterruptedException {
        Thread.sleep(1000);
        //takeScreenshots.takeSnapShot(driver, "Add Items to Cart Page");
        addToCartPage.clickAddToCartBackpackButton();
    }

    @Test(dependsOnMethods = "addItemsToCartTests2")
    public void clickAddToCartBikeLightButtonTest() throws InterruptedException {
        Thread.sleep(1000);
        //takeScreenshots.takeSnapShot(driver, "Add Items to Cart Page");
        addToCartPage.clickAddToCartBikeLightButton();
    }

    @Test(dependsOnMethods = "clickAddToCartBikeLightButtonTest")
    public void clickAddToCartBoltTShirtButtonTests() throws InterruptedException {
        Thread.sleep(1000);
        //takeScreenshots.takeSnapShot(driver, "Add Items to Cart Page");
        addToCartPage.clickAddToCartBoltTShirtButton();
    }

    @Test(dependsOnMethods = "clickAddToCartBoltTShirtButtonTests")
    public void clickAddToCartFleeceJacketButtonTests() throws InterruptedException {
        Thread.sleep(1000);
        //takeScreenshots.takeSnapShot(driver, "Add Items to Cart Page");
        addToCartPage.clickAddToCartFleeceJacketButton();
    }

    @Test(dependsOnMethods = "clickAddToCartFleeceJacketButtonTests")
    public void clickShoppingCartContainerTests2() throws InterruptedException {
        Thread.sleep(1000);
        takeScreenshots.takeSnapShot(driver, "Add Items to Cart Page");
        addToCartPage.clickShoppingCartContainer();
    }

    @Test(dependsOnMethods = "clickShoppingCartContainerTests2")
    public void clickCheckoutButtonTests() throws InterruptedException {
        Thread.sleep(2000);
        takeScreenshots.takeSnapShot(driver, "Checkout Page");
        checkOutPage.clickCheckoutButton();
    }


    @Test(dependsOnMethods = "clickCheckoutButtonTests")
    public void enterFirstNameTests() throws InterruptedException {
         Thread.sleep(1000);
        // takeScreenshots.takeSnapShot(driver, "Enter First Name Page");
        userDetailsPage.enterFirstName(readFromExcel.firstName);
    }

    @Test(dependsOnMethods = "enterFirstNameTests")
    public void enterSurnameTests() throws InterruptedException {
        Thread.sleep(1000);
        // takeScreenshots.takeSnapShot(driver, "Enter First Name Page");
        userDetailsPage.enterSurname(readFromExcel.lastName);
    }

    @Test(dependsOnMethods = "enterSurnameTests")
    public void enterPostalCodeTests() throws InterruptedException {
        Thread.sleep(3000);

        userDetailsPage.enterPostalCode(readFromExcel.postalCode);
        takeScreenshots.takeSnapShot(driver, "User Details Page");
    }

    @Test(dependsOnMethods = "enterPostalCodeTests")
    public void clickContinueButtonTests() {
        takeScreenshots.takeSnapShot(driver, "Checkout Your Details Page");
        userDetailsPage.clickContinueButton();
    }

    @Test(dependsOnMethods = "clickContinueButtonTests")
    public void clickFinishButtonTests() {
        takeScreenshots.takeSnapShot(driver, "Overview Page");
        overviewPage.VerifyTotal();
        overviewPage.clickFinishButton();
    }

    @Test(dependsOnMethods = "clickFinishButtonTests")
    public void verifyCheckoutCompleteTextTests() throws InterruptedException {
         Thread.sleep(2000);
        takeScreenshots.takeSnapShot(driver, "Checkout Complete Page");
        checkOutComplete.clickBackToProducts();
    }

    @Test(dependsOnMethods = "verifyCheckoutCompleteTextTests")
    public void verifyMenuTests() throws InterruptedException {
        //Thread.sleep(3000);
        takeScreenshots.takeSnapShot(driver, "Menu Page");
        menuPage.clickMenuButton();
    }

    @Test(dependsOnMethods = "verifyMenuTests")
    public void verifyLogoutTests() throws InterruptedException {
        Thread.sleep(3000);
        takeScreenshots.takeSnapShot(driver, "Logout Page");
        menuPage.clickLogoutButton();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
