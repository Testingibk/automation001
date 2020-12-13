import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Automation {

    @Test
    public void testUno(){

        System.setProperty("webdriver.chrome.driver", "D:\\Test_Capacitacion\\BDD-Cucumber_Gerkhin\\Drivers (ChromeDriver)\\chromedriver87.0.4280.88\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Abre la pagina sobre la que vamos a hacer las pruebas
        driver.get("http://automationpractice.com/index.php");

        driver.quit();

    }
}
