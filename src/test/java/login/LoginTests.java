package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests  extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.inputUsername("tomsmith");
        loginPage.inputPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.readSuccessMessage().contains("You logged into a secure area!"), "Unsuccessful Login");
    }
}
