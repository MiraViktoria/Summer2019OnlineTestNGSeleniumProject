package tests.day9_review;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.BrowserFactory;



public class TestNGReview {

    //whatever is common among tests, can go into @beforemethod and @aftermethod
    // it helps to reduce code duplication
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.out.println("Before method!");
        driver = BrowserFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("After method!");
        driver.quit();
    }

    @Test(description = "Verify title of google.com", priority = 2)
    public void test1() {
        System.out.println("Test 1");
        driver.get("http://google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not correct!");
    }

    //priority will change the order of test execution
    //by default tests are running in alphabetic order (a,b,c,d.. from the method name)
    //lower priority - earlier execution
    // lower priority number - higher priority of execution
    //tests will run like this: priority 1, priority 2, priority 3...
    //default is 0
    @Test(description = "Verify title of apple.com", priority = 1)
    public void verifyApplesPageTitle() {
        System.out.println("Test 2");
        driver.get("https://www.apple.com/");
        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();
        //message will be printed only if assertion failed
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not correct!");
        //if assertion failed, line below will not be reachable
        //if assertion passed, you will see message from line below
        System.out.println("Test passed!");
    }
//  data provider can supply test with a test data. Also, it allows to do Data Driven Testing.
//   What is this? It's when same test runs multiple times with different test data set

}