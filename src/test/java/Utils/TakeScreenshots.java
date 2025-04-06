package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshots {
    private static String screenshotDir = System.getProperty("user.dir") + "/Screenshots";

    public void takeSnapShot(WebDriver driver, String ScreenshotName) {
        // Cast the WebDriver instance to TakesScreenshot
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        // Get the screenshot as a file
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenshotDir, ScreenshotName + ".jpeg");

        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}