package tests.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class NavigationPractice {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().maximize();//to maximize browser window

        driver.get("http://google.com");

        driver.navigate().to("http://amazon.com");

        //navigate back to google (previous URL)
        driver.navigate().back();

        //move forward to the amazon again
        driver.navigate().forward();

        //to refresh/reload a webpage/website
        driver.navigate().refresh();

        driver.quit();
    }

}
