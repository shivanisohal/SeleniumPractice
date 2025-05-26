package SeleniumPracticeWork.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasic_4_NAVIGATETO {

    @Test
    public void NAVIGATETO_Example()
    {
        WebDriver driver=new EdgeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }

}
