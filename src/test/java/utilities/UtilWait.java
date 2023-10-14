package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class UtilWait {
    public static WebElement waitUntilElementToBeVisible(WebDriver driver, int seconds, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public static WebElement waitUntilElementIsClickBle(WebDriver driver, int seconds, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static List<WebElement> waitUntilAllElementsAreVisible(WebDriver driver, int seconds, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
//
//    public static Wait<WebDriver> WaitFluentlyUntilElementIsClickable
//            (WebDriver driver, int totalWaitTime, int pollingTime, By locator){
//
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(totalWaitTime))
//                .pollingEvery(Duration.ofSeconds(pollingTime))
//                .ignoring(NoSuchElementException.class);
       // return wait.until(ExpectedConditions.elementToBeClickable(locator));


    }



