package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage {
    private  WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public  ResultsPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }
    //Locators
    @FindBy(css = "i.icon-th-list")
    private  WebElement btnList;

    @FindBy(css = "div[class='content_price col-xs-5 col-md-12']")
    private WebElement lblPrice;

    @FindBy(id = "selectProductSort")
    private WebElement cmbSort;

    //Actions
    public void clickList(){
        wait.until(ExpectedConditions.elementToBeClickable(btnList)).click();
    }
    public String getPrice(){
        return wait.until(ExpectedConditions.visibilityOf(lblPrice)).getText().trim();
    }
    public void selectSort(String text){
        Select sort = new Select(cmbSort);
        sort.selectByVisibleText(text);

    }
}
