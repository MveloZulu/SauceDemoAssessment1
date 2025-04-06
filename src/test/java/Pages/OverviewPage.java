package Pages;

//import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage {
    WebDriver driver;

    @FindBy (id = "finish")
    WebElement finishButton_id;

//    @FindBy(css = ".summary_subtotal_label")
//    WebElement itemTotal;
//
//    @FindBy(css = ".summary_tax_label")
//    WebElement tax;
//
//    @FindBy(css = ".summary_total_label")
//    WebElement total;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }
//    public boolean verifyTotal() {
//        double itemTotalValue = Double.parseDouble(itemTotal.getText().replace("Item total: $", ""));
//        double taxValue = itemTotalValue * Constants.TAX_RATE;
//        double totalValue = Double.parseDouble(total.getText().replace("Total: $", ""));
//
//        double calculatedTotal = itemTotalValue + taxValue;
//        return calculatedTotal == totalValue;
//    }


    public void clickFinishButton() {
        finishButton_id.click();
    }
}
