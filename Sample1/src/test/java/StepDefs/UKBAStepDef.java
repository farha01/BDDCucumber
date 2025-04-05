package StepDefs;


import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UKBAStepDef extends BaseUtil {
   private BaseUtil base;

   public UKBAStepDef(BaseUtil base){
       this.base = base;
   }
    @Given("^I am on UKBA website$")
    public void i_am_on_ukba_website()  {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.gov.uk/check-uk-visa/y");
    }

    @And("^I choose country as \"([^\"]*)\"$")
    public void i_choose_country_as_something(String strArg1)  {
        WebElement element =  base.driver.findElement(By.xpath("//select[@id = 'response']"));
        Select select = new Select(element);
        select.selectByVisibleText(strArg1);


    }

    @And("^I click on continue button$")
    public void i_click_on_continue_button()  {
//        driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();
        WebElement element = base.driver.findElement(By.xpath("//button[contains(text(), 'Continue')]"));
        element.click();

    }
    @Then("^I should see the following message \"([^\"]*)\"$")
    public void i_should_see_the_following_message_something(String strArg1)  {
        WebElement element = base.driver.findElement(By.xpath("//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']"));
        String message = element.getText();
        assertThat(message, is(equalTo(strArg1)));

    }
}
