package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    //fields
        private WebDriver driver;
        private By successMessage = By.id("flash");

    //methods
        public SecureAreaPage(WebDriver driver){
            this.driver = driver;
        }

        public String readSuccessMessage(){
            System.out.println(driver.findElement(successMessage).getText());
            return driver.findElement(successMessage).getText();
        }
}

