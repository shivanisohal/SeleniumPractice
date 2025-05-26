package SeleniumPracticeWork.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class SeleniumBasic_TestNg_Assertion {

    @Test
    public void TestMethod()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        //AssertJ validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull()
                .isNotEmpty().isEqualTo("https://katalon-demo-cura.herokuapp.com/");
    }
}
