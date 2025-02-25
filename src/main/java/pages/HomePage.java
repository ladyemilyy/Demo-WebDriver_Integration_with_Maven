package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //fields
        private WebDriver driver;

        //locator to get the dropdown link
        private By dropdownLink = By.linkText("Dropdown");

    //methods
        //constructor to pass the webdriver when the class is instantiated
        public HomePage(WebDriver driver){
            this.driver = driver;
        }

        //Generic link-clicking method
    private void clickLink(String linkText){
            driver.findElement(By.linkText(linkText)).click();
    }

    //to interact with the form authentication link
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    //link for dropdown
    public DropdownPage clickDropdownLink(){
            clickLink("Dropdown");
            return new DropdownPage(driver);

    }
    //link for forgot password
    public ForgotPasswordPage clickForgotPasswordLink(){
            clickLink("Forgot Password");
            return new ForgotPasswordPage(driver);
    }

    //link for hovers page
    public HoverPage clickHoverLink(){
            clickLink("Hovers");
            return new HoverPage(driver);
    }

    //link for key presses
    public KeyPressesPage clickKeyPressesLink(){
            clickLink("Key Presses");
            return new KeyPressesPage(driver);
    }
}
