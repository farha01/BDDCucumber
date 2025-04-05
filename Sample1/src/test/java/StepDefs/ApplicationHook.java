package StepDefs;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationHook extends BaseUtil {
    private BaseUtil base;

    public ApplicationHook(BaseUtil base){
        this.base =  base;
    }

    @Before
    public void initialise(){
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();

    }

    @After
    public void tearDown(){
        base.driver.close();
        base.driver.quit();

    }
}
