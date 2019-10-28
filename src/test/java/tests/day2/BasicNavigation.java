package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        // to maximize browser
        driver.manage().window().maximize();
        driver.get("http://google.com");

        // we want to navigate to the different page
        //within ame browser
        //we are not going to open new browser
        //url can be passed as an object
        //or as a string
        //we use string
        driver.navigate().to("http:/amazon.com");

        //if i want to comeback to previous page
        driver.navigate().back();
        // if I want to know URL of curent page

        String url = driver.getCurrentUrl();
        System.out.println(url);
        // selenium cannot close broweser automatically
        //for this we use method close()
        driver.close();






    }

}
