package VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class Login {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        BrowserUtils.wait(3);

        driver.navigate().to("https://qa2.vytrack.com/user/login");
        BrowserUtils.wait(3);


        driver.findElementByName("_username").sendKeys("storemanager88");
        BrowserUtils.wait(3);


        driver.findElement(By.name("_password")).sendKeys("UserUser123");
       BrowserUtils.wait(3);


        driver.findElement(By.id("_submit")).click();


        BrowserUtils.wait(3);

        String expectedResult = "https://qa2.vytrack.com/";
        String actualResult = driver.getCurrentUrl();

         if (expectedResult.equals(actualResult)){
             System.out.println("test passed");
         }
         else{
             System.out.println("test failed");
             System.out.println("Expected result --> " + expectedResult);
             System.out.println("Actual result --> "+  actualResult );
         }

         BrowserUtils.wait(3);


         driver.close();

    }
}
