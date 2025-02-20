package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //fields
        private WebDriver driver;
        //locator to get and represent the form authentication link
        private By formAuthenticationLink = By.linkText("Form Authentication");

    //methods
        //constructor to pass the webdriver when the class is instantiated
        public HomePage(WebDriver driver){
            this.driver = driver;
        }

        //to interact with the link
        public LoginPage clickFormAuthentication(){
            driver.findElement(formAuthenticationLink).click();
            return new LoginPage(driver);
        }
}
