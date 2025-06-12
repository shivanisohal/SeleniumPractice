package SeleniumPracticeWork.SeleniumBasics.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SVG {

    @Test
    public void test()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com");

        driver.findElement(By.name("q")).sendKeys("iphone");

        List<WebElement> svg= driver.findElements(By.xpath("//*[local-name()='svg']"));
        svg.get(0).click();

    }
}
