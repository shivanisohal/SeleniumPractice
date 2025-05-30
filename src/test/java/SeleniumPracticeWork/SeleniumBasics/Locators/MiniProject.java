package SeleniumPracticeWork.SeleniumBasics.Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiniProject {

    @Description("Verify Error for invalid email")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Shivani")
    @Test
    public void Test()
    {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement a_tag=driver.findElement(By.partialLinkText("trial"));
        a_tag.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement Id= driver.findElement(By.id("page-v1-step1-email"));
       Id.sendKeys("admin@abccom");

       WebElement checkbox= driver.findElement(By.name("gdpr_consent_checkbox"));
       checkbox.click();

       WebElement btn= driver.findElement(By.tagName("button"));
       btn.click();


       WebElement err= driver.findElement(By.className("invalid-reason"));
       Assert.assertEquals(err.getText(),"The email address you entered is incorrect.");
      // err.getText();



        }

    }

