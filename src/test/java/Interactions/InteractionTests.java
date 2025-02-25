package Interactions;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InteractionTests extends BaseTests {

    @Test
    public void TestDropDdwn(){
        var dropDownpage = homepage.clickDropdownLink();
        dropDownpage.selectFromDropdown("Option 1");
        var selectedOption =dropDownpage.getSelectedOption();
        assertEquals(selectedOption.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOption.contains("Option 1"), "Option not selected");
    }

}
