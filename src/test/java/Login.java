import StepObject.LoginSteps;
import Utils.ChromeRunner;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.LoginData.*;
import static java.lang.Thread.sleep;


public class Login extends ChromeRunner {
 @Test (priority = 1)
  public void loginWithIncorrectData() throws InterruptedException {


        LoginSteps step1 = new LoginSteps(ChromeRunner.driver);
        step1.emailInput(incorrectEmailData);
        step1.passwordInput(incorrectPasswordData);
        step1.loginButton();
       Thread.sleep(5000);


    }

    @Test (priority = 2)
    public void loginWithCorrectEmail() throws InterruptedException {


        LoginSteps step2 = new LoginSteps(ChromeRunner.driver);
        step2.emailInput(correctEmailData);
        step2.passwordInput(incorrectPasswordData);
        step2.loginButton();
        Thread.sleep(5000);

    }

    @Test (priority = 3)
    public void assertResult() throws InterruptedException {
     LoginSteps step3 = new LoginSteps(ChromeRunner.driver);
     Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(5000);
    }
}



