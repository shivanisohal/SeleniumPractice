package SeleniumPracticeWork.SeleniumBasics.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class svgexample2 {


    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        //*[local-name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']


        List<WebElement> States= driver.findElements(By.xpath("//*[local-name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for(WebElement states : States )
        {
            System.out.println(states.getAttribute("aria-label"));

            if(states.getAttribute("aria-label").contains("Himachal Pradesh"))
            {
                js.executeScript("arguments[0].scrollIntoView(true);", states);

                states.click();
            }
        }


    }
}

