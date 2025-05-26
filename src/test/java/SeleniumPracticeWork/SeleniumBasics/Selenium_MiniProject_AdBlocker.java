package SeleniumPracticeWork.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium_MiniProject_AdBlocker {

    @Test
    public void TestProject()
    {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addExtensions(new File("src/test/java/SeleniumPracticeWork/SeleniumBasics/AdBlock.crx"));

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=9WMJ-eUMrCk&t=83s");

    }
}
