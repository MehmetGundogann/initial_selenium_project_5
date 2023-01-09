import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Driver_Navigation {
    public static void main(String[] args) throws InterruptedException {

                /*
                TEST CASE
                Go to https://www.techglobalschool.com
                Refresh the page
                Navigate to https://www.amazon.com/
                Navigate back to TechGlobal website
                Navigate forward Amazon website
                Validate the URL of the page
                Validate the title of the page


                EXPECTED RESULT:
                URL  = https://www.amazon.com/
                Title = Amazon.com. Spend less. Smile more.
                 */
        System.setProperty("webdriver.chrome.driver","/Users/mehmetgundogan/IdeaProjects/initial_selenium_project_5/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Test Validation
        driver.get(" https://www.techglobalschool.com");
        Thread.sleep(2000);

        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);


    }
}
