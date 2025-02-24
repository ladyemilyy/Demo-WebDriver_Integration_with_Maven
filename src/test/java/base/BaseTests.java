package base;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //declaredriver variable(object)
        driver = new ChromeDriver(); //instantiating the chrome driver
        System.out.println("Instantiating driver...");
        driver.get("https://the-internet.herokuapp.com/"); //launch the website
        driver.manage().window().maximize(); //specify size of window after launch
        System.out.println(driver.getTitle()); //output title of page

        homepage = new HomePage(driver);

    }

//    @AfterClass
//    public void endSession(){
//        driver.quit(); //close window and terminate browser session
//    }

}