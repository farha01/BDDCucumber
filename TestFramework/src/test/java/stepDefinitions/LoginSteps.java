package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import java.time.Duration;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage = new LoginPage(driver);
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        try {
            Thread.sleep(3000);
            loginPage.enterUsername("student");
            Thread.sleep(3000);
            loginPage.enterPassword("Password123");
            Thread.sleep(3000);
            loginPage.clickLogin();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        }


    @Then("User should be redirected to the dashboard")
    public void user_should_be_redirected_to_dashboard() {
        Assert.assertTrue(loginPage.isDashboardDisplayed());
        //driver.quit();
    }


    @Then ("User should click on Practice Tab")
    public void user_should_clickon_Practice_Tab() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id("menu-item-20")).click();
        Thread.sleep(10000);


    }

        @Then ("User should close the browser")
        public void User_should_close_the_browser(){
        driver.quit();
    }
}
