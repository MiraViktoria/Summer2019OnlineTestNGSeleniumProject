package tests.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserFactory;

public class TestNGPractice {
    @Test
    public void test(){
        // to verify that expected and actual results are the same.
        // if no, it will stop program.
        // AssertEquals compares two results
        Assert.assertEquals("appl","apple","Word is not correct! should be apple");
        //  if(str.equals(str2)){
        //  System.out.println("Passed");
        //  } else{
        //  System.out.println("Test failed");
        //  }
    }
    @Test
     public void verifyTitle() {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/");
            String expectedTitle = "Practice";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Title is wrong");
            driver.quit();
    }
        // lets verify that test automation practice heading is displayed
        @Test(description = "Verify that heading is displayed")
        public void verifyHeadingIsDisplayed(){
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/");
            //if there is no element with this locator, we will get NoSuchElementException
            //and our program will stop on the findElement line
            WebElement heading = driver.findElement
                    (By.xpath("//span[text()='Test Automation Practice']"));
            //to make sure that element is visible to user
            //because element can be present, but not visible
            //we need to make sure element is visible
            // assertTrue -checking if its true
            // isDisplayed() returns true or false
            Assert.assertTrue(heading.isDisplayed(),"Element is not visible");
            driver.quit();
        }
}
