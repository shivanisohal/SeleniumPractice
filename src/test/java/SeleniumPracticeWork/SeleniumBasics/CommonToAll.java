package SeleniumPracticeWork.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonToAll {

    WebDriver driver;
    public void openBrowser(String url)
    {
        driver=new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
