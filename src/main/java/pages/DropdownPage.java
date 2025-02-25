package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    //fields
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    //constructor
    public DropdownPage (WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        findDropdownELement().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
        List<WebElement> selectedElements =
            findDropdownELement().getAllSelectedOptions();
        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public Select findDropdownELement(){
        return new Select(driver.findElement(dropdown));
    }
}


