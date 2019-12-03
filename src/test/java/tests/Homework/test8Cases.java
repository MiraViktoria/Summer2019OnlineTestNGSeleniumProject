package tests.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class test8Cases {

    private WebDriver driver;

    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
         driver.findElement(By.linkText("“Sign Up For Mailing List”")).click();

         driver.findElement(By.name("Full name")).sendKeys("Mira");
        BrowserUtils.wait(3);
         driver.findElement(By.name("Email")).sendKeys("seraphine1226@gmail.com");
        BrowserUtils.wait(3);
         driver.findElement(By.name("Sign Up")).click();
        BrowserUtils.wait(3);


        WebElement heading = driver.findElement(By.name("Thank you for signing up. Click the button below to return to the home page"));

        driver.quit();


    }

}
