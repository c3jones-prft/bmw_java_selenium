package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class NavSteps {

//    @Given("user is on home page")
//    public void verifyHomepageNavigation(){
//        System.out.println("Time to test BMW.com!");
//    }
    WebDriver driver;

    @Given("user has started a web browser")
    public void user_generates_browser(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }
    @And("user is on home page")
    public void user_navigated_to_home_page(){

        driver.navigate().to("https://www.bmw.com/en/index.html");
        System.out.println("Step Detail - user is navigated to homepage");

    }

    @When("home page loads")
    public void user_ready_on_home_page(){
        System.out.println("Step Detail - user has cached homepage");

    }

    @And("user clicks on tab home")
    public void user_clicks_home_tab(){
        System.out.println("Step Detail - user clicks home tab within topnav");
    }

    @Then("user is redirected to the current page of the web application")
    public void user_links_to_home(){
        System.out.println("Step Detail - user is returned to homepage");
    }
}
