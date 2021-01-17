import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.ResultsPage;
import pageobjects.SearchPage;

public class Automation {

    private  WebDriver driver;
    @BeforeMethod

    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "D:\\Test_Capacitacion\\BDD-Cucumber_Gerkhin\\Drivers (ChromeDriver)\\chromedriver87.0.4280.88\\chromedriver.exe");
        driver = new ChromeDriver();

        //Abre la pagina sobre la que vamos a hacer las pruebas
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void testUno() throws InterruptedException {

        SearchPage search = new SearchPage(driver);
        search.writeSearch("blouse");
        search.clickSearch();

        ResultsPage results = new ResultsPage(driver);
        results.clickList();

        results.selectSort("Price: Lowest first");

        Assert.assertEquals(results.getPrice(), "$27.00");

        Thread.sleep(3000);

        }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
