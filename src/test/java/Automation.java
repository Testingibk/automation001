import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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


        WebElement txtBusqueda = driver.findElement(By.id("search_query_top"));
        txtBusqueda.sendKeys("blouse");

        WebElement btnBuscar = driver.findElement(By.cssSelector("button[name='submit_search']"));
        btnBuscar.click();

        //WebElement lblMensaje = driver.findElement(By.cssSelector("p.alert.alert-warning"));

        //Assert.assertEquals(lblMensaje.getText(),"No results were found for your search \"jeans\"");

        WebElement btnList = driver.findElement(By.cssSelector("i[class='icon-th-list']"));
        btnList.click();

        WebElement lblPrecio = driver.findElement(By.cssSelector("div[class='content_price col-xs-5 col-md-12']"));
        Assert.assertEquals(lblPrecio.getText(), "$27.00");

        Thread.sleep(3000);

        }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
