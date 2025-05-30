package SeleniumPracticeWork.SeleniumBasics.Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LinkText {

    @Description("LinkText Testcase")
    @Owner("Shivani")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void linktext_test()
    {

        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://app.vwo.com");
        edgeDriver.manage().window().maximize();

//        WebElement a_Tag = edgeDriver.findElement(By.linkText("Start a free trial"));
//        a_Tag.click();

        //PartialLinkText

        //Start a
        //Start a free
        //Start a free trial
        WebElement Partial= edgeDriver.findElement(By.partialLinkText("trial"));
        Partial.click();

    }

}
