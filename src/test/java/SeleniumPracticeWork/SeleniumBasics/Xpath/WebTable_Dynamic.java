package SeleniumPracticeWork.SeleniumBasics.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable_Dynamic {

    @Test
    public void test()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement body= driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        List<WebElement> row=body.findElements(By.tagName("tr"));

        for(int i=0;i<row.size();i++)
        {
            List<WebElement> cols=row.get(i).findElements(By.tagName("td"));
            for(WebElement c : cols )
            {
                System.out.println(c.getText());
            }
        }

    }
}
