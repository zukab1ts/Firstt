package StepObject;
import DataObject.LoginData;
import org.openqa.selenium.WebDriver;
import PageObject.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps extends LoginPage {
    WebDriver driver;

    public LoginSteps(WebDriver driver1) {
        driver = driver1;
    }

    public void emailInput(String s) {
        driver.findElement(emailField).sendKeys(s);
    }

    public void passwordInput(String s) {
        driver.findElement(passwordField).sendKeys(s);
    }

    public void loginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();


    }
}