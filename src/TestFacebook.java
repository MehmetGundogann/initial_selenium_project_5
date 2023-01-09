import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGloabalUtil;

import java.util.List;

public class TestFacebook {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");

        if (driver.getTitle().equals(" Facebook - log in or sign up")) System.out.println();

        if (driver.getTitle().equals("Facebook - log in or sign up")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        if (driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

//        WebElement logo = driver.findElement(By.className("fb_logo _8ilh img"));
//
//        if(logo.isDisplayed())System.out.println("Logo validation PASSED");
//        else System.out.println("Logo validation FAILED");


        WebElement text = driver.findElement(By.className("_8eso"));
        if (text.isDisplayed()) System.out.println("Text validation PASSED");
        else System.out.println("Text validation FAILED");

        WebElement emailAndPhoneNumber = driver.findElement(By.name("email"));
        if (emailAndPhoneNumber.isDisplayed()) System.out.println("emailAndPhoneNumber validation PASSED");
        else System.out.println("emailAndPhoneNumber validation FAILED");

        WebElement password = driver.findElement(By.name("pass"));
        if (password.isDisplayed()) System.out.println("Password validation PASSED");
        else System.out.println("Password validation FAILED");


        WebElement login = driver.findElement(By.name("login"));
        if (login.isDisplayed()) System.out.println("Login validation PASSED");
        else System.out.println("Login validation FAILED");

        WebElement forgotPassword = driver.findElement(By.linkText("Forgot password?"));
        if (forgotPassword.isDisplayed()) System.out.println("forgotPassword validation PASSED");
        else System.out.println("forgotPassword validation FAILED");

//        WebElement createNewAccount = driver.findElement(By.linkText("open-registration-form-button"));
//        if (createNewAccount.isDisplayed()) System.out.println("createNewAccount validation PASSED");
//        else System.out.println("createNewAccount validation FAILED");


        driver.close();
    }
}

