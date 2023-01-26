package browserfactory;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*  BaseUrl = https://opensource-demo.orangehrmlive.com/
        1. Create the package ‘browserfactory’ and create the class
with the name ‘BaseTest’ inside the ‘browserfactory’
        package. And write the browser setup code inside the
class ‘Base Test’.  */
public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        ChromeOptions options = new ChromeOptions(); // setting Webdriver
        driver = new ChromeDriver(options);
        driver.get(baseUrl);// Lunch the URL
        driver.manage().window().maximize();
    }
    public void closeBrowser() {
        driver.quit();
    }
}
