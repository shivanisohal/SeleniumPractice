package SeleniumPracticeWork.SeleniumBasics.Basic;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasic_1 {

    @Test
    public void OpenLoginPage()
    {
        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://app.vwo.com");
        System.out.println(edgeDriver.getTitle());
        edgeDriver.quit();
    }
}
