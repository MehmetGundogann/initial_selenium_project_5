import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGloabalUtil;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {




        try {

            //1. set up
            WebDriver driver = Driver.getDriver();

            TechGloabalUtil.getFrontendTesting();

            driver.findElement(By.id("card-1")).click();
            WebElement kiwiItem = driver.findElement(By.id("item_kiwi"));
            WebElement orangeItem = driver.findElement(By.name("item_orange"));
            WebElement grapesItem= driver.findElement(By.className("item_grapes"));


            if (kiwiItem.isDisplayed())System.out.println("Kiwi item validation PASSED");
            else System.out.println("Kiwi item validation FAILED");

            if (orangeItem.isDisplayed())System.out.println("Orange item validation PASSED");
            else System.out.println("Orange item validation FAILED");

            if (grapesItem.isDisplayed())System.out.println("Grapes item validation PASSED");
            else System.out.println("Grapes item validation FAILED");

            WebElement heading = driver.findElement(By.id("main_heading"));
            if(heading.isDisplayed())System.out.println("Heading displayed  PASSED");
            else System.out.println("Heading displayed FAILED");
            System.out.println("Heading displayed  PASSED");

            if(heading.getText().equals("Locators")) System.out.println("Heading ");

        }catch (Exception e){
            System.out.println("TEST FAILED dude to " + e.getMessage());
        }
        finally {
            //3.teardown
            Driver.getDriver();
        }

    }

}