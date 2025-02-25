package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrieveButton = By.id("form_submit");

    //constructor
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void sendEmailText(){
        driver.findElement(emailField).sendKeys("newemail@email.com");
    }

    public void clickRetrievePasswordButton(){
        driver.findElement(retrieveButton).click();
    }
}
