package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Write down the following test into ‘LoginTest’ class
       1. userSholdLoginSuccessfullyWithValidCredentials
        * Enter “Admin” username
        * Enter “admin123 password
        * Click on ‘LOGIN’ button
        * Verify the ‘Welcome’ text is display
        * Click on ‘LOGIN’ button
        * Verify the text “Secure Area”
       2. verifyTheUsernameErrorMessage
         */
        public class LoginTest extends BaseTest {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        //WebDriver driver = new ChromeDriver(); //creating object of chrome webdriver
    @Before
    public void setup() {
        openBrowser(baseurl);
    }

       @Test
       public void userShouldLoginSuccessfullyWithValidCredentials() {
      // Enter “Admin” username
        WebElement usernameKey = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='username']"));
        usernameKey.sendKeys("Admin");
      //Enter “admin123 password
        WebElement passwordKey=  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='password']"));
        passwordKey.sendKeys("admin123");
        //click on Login button
          // WebElement loginButton =driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
           loginButton.click();
  }


}