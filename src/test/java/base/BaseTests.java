package base;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BaseTests {

    WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //declaredriver variable(object)
        driver = new ChromeDriver(); //instantiating the driver
        System.out.println("Instantiating driver...");
        driver.get("https://the-internet.herokuapp.com/"); //launch the driver
        System.out.println("It worked");
        driver.manage().window().setSize(new Dimension(375, 812)); //specify size of window after launch
        System.out.println(driver.getTitle()); //output title of page
        WebElement shiftingContentsLink = driver.findElement(By.linkText("Shifting Content")); //locating an element by its actual name
        shiftingContentsLink.click(); //simulate clicking on the link
        List<WebElement> exampleLink = driver.findElements(By.tagName("a")); //locating an element(s) by its tag
        System.out.println(exampleLink.size());
        exampleLink.get(1).click();
        driver.manage().window().fullscreen();
        List<WebElement> linkButtons = driver.findElements(By.tagName("li"));
        System.out.println("The number of link-buttons are: " + linkButtons.size());

//        driver.quit(); //close window and terminate browser session
    }


    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }

}