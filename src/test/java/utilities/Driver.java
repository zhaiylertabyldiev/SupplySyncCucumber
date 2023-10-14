package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;


    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/zhaiylertabyldiev/Desktop/My Java Projects/SeleniumFirstProject/src/test/drivers/chromedriver");

        if (driver != null) {
            return driver;
        }

        String browser = Config.getProperty("browser");

        switch (browser) {
            case "chrome" -> driver = new ChromeDriver();
            case "firefox" -> driver = new FirefoxDriver();
            default -> driver = new ChromeDriver();
        }

        driver.manage().window().maximize();

        //PageLoadWait waits until elements in the page are visible
        int pageWait = Integer.parseInt((Config.getProperty("pageLoadTimeOut")));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageWait));

        //Implicit waits, waits until element is visible.
        int waitTime = Integer.parseInt(Config.getProperty("implicitWait"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
