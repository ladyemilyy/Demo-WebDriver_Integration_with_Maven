package Interactions;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InteractionTests extends BaseTests {

    //test for dropdown list selection
    @Test
    public void testDropDown(){
        var dropDownpage = homepage.clickDropdownLink();
        dropDownpage.selectFromDropdown("Option 1");
        var selectedOption =dropDownpage.getSelectedOption();
        assertEquals(selectedOption.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOption.contains("Option 1"), "Option not selected");
    }

    //test for forgot password and email verification
    @Test
    public void testForgotPassword(){
        var forgotPasswordPage = homepage.clickForgotPasswordLink();
        forgotPasswordPage.sendEmailText();
        forgotPasswordPage.clickRetrievePasswordButton();
    }

    //test for hovering over elements
    @Test
    public void testHover(){
        var hoverPage = homepage.clickHoverLink();
        var caption = hoverPage.hoverOverElements(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1","Caption title incorrect");
        assertEquals(caption.getLinktext(), "View profile","Caption link text incorrect" );
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }

    @Test
    public void testKeyPresses(){
        var keyPressesPage = homepage.clickKeyPressesLink();
        keyPressesPage.enterText("ABCD" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE", "wrong key message");
    }
}
