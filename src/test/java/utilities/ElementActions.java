package utilities;

import env.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

import javax.swing.*;
import java.time.Duration;
import java.util.Random;

public class ElementActions extends base {
    public static WebElement element = null;
    public static WebElement findAndWaitForTheElement(By locator)
    {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element = driver.findElement(locator);
        }
        catch (Exception e)
        {
            System.out.println("Element not Found");
        }
        return  element;
    }
    //will return current URL
    public static String getURL()
    {
        return driver.getCurrentUrl().toString();
    }
    //will hover on an element
    public static void hoverElement(By locator)
    {
        //WebElement el = findAndWaitForTheElement(locator);
        Actions act = new Actions(driver);
        act.moveToElement(findAndWaitForTheElement(locator)).perform();
    }
    //will click one item
    public static void clickOnItem(By locator)
    {
        findAndWaitForTheElement(locator).click();
    }
    //will clear any input field
    public static void clearField(By locator)
    {
        findAndWaitForTheElement(locator).sendKeys(Keys.BACK_SPACE);
    }
    //will type something in any input field
    public static void sendText(By locator, String text)
    {
        findAndWaitForTheElement(locator).sendKeys(text);
    }
    //will check an specific element is visible or not
    public static boolean visibilityCheck(By locator)
    {
        return findAndWaitForTheElement(locator).isDisplayed();
    }
    //select value from any dropdown by text
    public static void selectFromDropDown(By locator, String text)
    {
        Select dropdown = new Select(findAndWaitForTheElement(locator));
        dropdown.selectByVisibleText(text);
    }
    //select value from any dropdown by value
    public static void selectFromDropDownByValue(By locator, String text)
    {
        Select dropdown = new Select(findAndWaitForTheElement(locator));
        dropdown.selectByValue(text);
    }
    //return the text value of current element
    public static String getText(By locator)
    {
        return findAndWaitForTheElement(locator).getText();
    }
    //will generate random email
    public static String generateEmailDynamically()
    {
        Random ra = new Random();
        return ("jondoe"+ra.nextInt(999)+"@gmail.com");
    }
    public static String itemSelectedOrNot(By locator)
    {
        String value = findAndWaitForTheElement(locator).getCssValue("Color");
        return value;
    }
//    public static boolean tabTitleCheck(String expectedTitle)
//    {
//        String actualTitle = driver.getTitle();
//        return actualTitle.equalsIgnoreCase(expectedTitle);
//    }


}