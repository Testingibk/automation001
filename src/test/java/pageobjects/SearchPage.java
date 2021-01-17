package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    private  WebDriver driver;
    private WebDriverWait wait;
    //Constructor

    public SearchPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    //Locators
    @FindBy(id = "search_query_top")
    private WebElement txtSearch;

    @FindBy(css = "button[name='submit_search']")
    private  WebElement btnSearch;

    //Actions
    public void writeSearch(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtSearch)).sendKeys(term);

    }
    public void clickSearch(){
        wait.until(ExpectedConditions.elementToBeClickable(btnSearch)).click();
        btnSearch.click();
    }




}
