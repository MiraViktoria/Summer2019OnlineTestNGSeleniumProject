package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElementsTest {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedTitle = driver.getTitle();
        // Step 1. open inspector in chrome and find locator of the element.
        //Stem 2. Create obj for WebElement.
        //Step 3. Use WebElement
        WebElement button = driver.findElement(By.id("form_submit"));
        button.click();
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("TestPassed");
        }else{
            System.out.println("Test Failed");
            System.out.println("Expected title: "+expectedTitle);
            System.out.println("Actual title: "+actualTitle);
        }
       BrowserUtils.wait(2);
        driver.close();
 }
}