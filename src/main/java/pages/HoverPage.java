package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    By figureBox = By.className("figure");
    By boxCaption = By.className("figcaption");

    public HoverPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * @param index starts at 1
     */

    //method to hover over elements
    public FigureCaption hoverOverElements(int index){
        WebElement figure = driver.findElements(figureBox).get(index -1);

        //introduce advanced interaction(hover) methods by using Actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getTitle() {
            return caption.findElement(header).getText();
        }

        public String getLink() {
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinktext(){
            return caption.findElement(link).getText();
        }
    }

}
