package Pages;

//import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OverviewPage {
    WebDriver driver;



    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[6]")
    WebElement itemTotal_xpath;

    @FindBy(xpath= "//div[@id='checkout_summary_container']/div/div[2]/div[7]")
    WebElement tax_xpath;

    @FindBy(xpath = "//div[@id='checkout_summary_container']/div/div[2]/div[8]")
    WebElement total_xpath;


    @FindBy (id = "finish")
    WebElement finishButton_id;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public double getItemTotal(WebElement element) {
        String itemCostText = element.getText();
        String[] splitText = itemCostText.split(" \\$");
        return Double.parseDouble(splitText[1]);
    }

    public void VerifyTotal() {
        double sum = getItemTotal(itemTotal_xpath)+getItemTotal(tax_xpath);
        double totalAmount = Math.floor(sum*100) / 100;
        double actualTotal = getItemTotal(total_xpath);

        Assert.assertEquals(totalAmount, actualTotal);
        System.out.println("Expected Total: " + totalAmount + "=" + " Actual Total: " + actualTotal);

    }


    public void clickFinishButton() {
        finishButton_id.click();
    }
}
