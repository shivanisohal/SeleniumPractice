package SeleniumPracticeWork.SeleniumBasics;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class SeleniumBasic_3 extends CommonToAll {

    @Test
    public void testmethod() throws Exception {

        openBrowser("https://katalon-demo-cura.herokuapp.com/");

        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("Testcase Passed");
            Assert.assertTrue(true);
        }
        else {

            Assert.fail("Not visible");
            //throw new Exception("Not visible");
        }
    }
}
