package testsuite;

import browserfactory.BaseTest;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
/*Write down the following test into ‘ForgotPasswordTest’
     class
      1. userShouldNavigateToForgotPasswordPageSuccessfully
        * click on the ‘Forgot your password’ link
        * Verify the text ‘Forgot Your Password?’  */
      public class ForgotPasswordTest extends BaseTest {
      String baseurl = "https://opensource-demo.orangehrmlive.com/";
      @Before
      public void setUp() {
            openBrowser(baseurl);
      }
      @Test
      public void userShouldNavigateToForgotPasswordPageSuccessfully(){
            // click on the ‘Forgot your password’ link
            WebElement forgotPasswordLink = driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
      forgotPasswordLink.click();
      // Verify the text ‘Forgot Your Password?
              WebElement forgotRegisterLink=driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
      String actualText=forgotRegisterLink.getText();
      String expectedText="Forgot your password?";
      assertEquals(expectedText,actualText);
      }

}
