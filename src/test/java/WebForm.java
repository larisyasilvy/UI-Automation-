import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class WebForm extends PageObject{
    private final String SEARCH = "Apply for a number plate";
    private final String SUBURB = "Sydney 2000";

    @FindBy(xpath = "//div[@id='globalAutosuggest']/input")
    private WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit_button;

    @FindBy(xpath = "//a[contains(text(),'Find locations')]")
    private WebElement find_loc;

    @FindBy(id = "locatorTextSearch")
    private WebElement suburb;

    @FindBy(xpath = "//button[@aria-label='Search']")
    private WebElement submit_button_sub;

    @FindBy(xpath = "//a[contains(text(),'Marrickville Service Centre')]")
    private WebElement mark;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterSearch(){

        this.search.sendKeys(SEARCH);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

    public void pressFindLoc(){
        this.find_loc.click();
    }

    public void enterSearchSuburb(){
        this.suburb.sendKeys(SUBURB);
    }

    public void pressSubmitButtonSub(){
        this.submit_button_sub.click();
    }
}
