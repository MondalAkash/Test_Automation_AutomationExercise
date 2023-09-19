package env;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;

import java.io.File;

public class base {
    public static WebDriver driver;
    @BeforeSuite
    public void initializeDrive() throws InterruptedException {
        String URL = "http://automationexercise.com";
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--disable-notifications");
        //op.addExtensions(new File("H:\\Automation project\\Automation Exercise\\extension_5_10_0_0.crx"));
        driver = new ChromeDriver(op);
        driver.manage().window().maximize();
        driver.get(URL);
    }
    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
