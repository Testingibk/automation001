package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import pageobjects.ResultsPage;
import pageobjects.SearchPage;

public class SearchProductSteps {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Test_Capacitacion\\BDD-Cucumber_Gerkhin\\Drivers (ChromeDriver)\\chromedriver87.0.4280.88\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("^El cliente se encuentra en la pagina de busqueda$")
    public void elClienteSeEncuentraEnLaPaginaDeBusqueda() {
        driver.get("http://automationpractice.com/index.php");
        
    }

    @When("^realice la busqueda de productos con el termino \"([^\"]*)\"$")
    public void realiceLaBusquedaDeProductosConElTermino(String term) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SearchPage search = new SearchPage(driver);
        search.writeSearch(term);
        search.clickSearch();
    }

    @And("^cambia la visualizacion de resultados a modo lista$")
    public void cambiaLaVisualizacionDeResultadosAModoLista() {
        ResultsPage results = new ResultsPage(driver);
        results.clickList();
        
    }

    @Then("^se muestra el producto con el precio \"([^\"]*)\"$")
    public void seMuestraElProductoConElPrecio(String price) throws Throwable {
        ResultsPage results = new ResultsPage(driver);
        Assert.assertEquals(results.getPrice(), price);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
