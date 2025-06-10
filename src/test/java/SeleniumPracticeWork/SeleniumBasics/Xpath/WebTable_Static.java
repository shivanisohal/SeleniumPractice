package SeleniumPracticeWork.SeleniumBasics.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable_Static {

    @Test
    public void Test()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        String FirstPart="//table[@id='customers']/tbody/tr[";
        String SeconfPart="]/td[";
        String ThirdPart="]";

      int rows=  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
      int cols= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println("Rows="+rows+"Columns="+cols);

      for(int i=2; i<=rows;i++)
      {
          for(int j=1;j<=cols;j++)
          {
String Dynamic_xpath=FirstPart+i+SeconfPart+j+ThirdPart;
             // System.out.println(Dynamic_xpath);
              String Data=driver.findElement(By.xpath(Dynamic_xpath)).getText();
              //table[@id='customers']/tbody/tr[5]/td[2]/following-sibling:: td

              if(Data.contains("Helen Bennett"))
              {
                  String Path= Dynamic_xpath+"/following-sibling:: td";
                  String Data2= driver.findElement(By.xpath(Path)).getText();

                  System.out.println("Helen is in"+Data2);
              }
          }

      }


    }
}
