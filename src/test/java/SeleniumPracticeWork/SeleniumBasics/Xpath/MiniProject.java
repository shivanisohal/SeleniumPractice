package SeleniumPracticeWork.SeleniumBasics.Xpath;

import SeleniumPracticeWork.SeleniumBasics.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MiniProject extends CommonToAll {


    @Description("Mini Project for Login Page")
    @Owner("Shivani")
    @Severity(SeverityLevel.BLOCKER)
    @Test


    public void MiniProject() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
       //WebElement btn= driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        WebElement btn= driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]"));
        btn.click();

        //Text Matching


        driver.manage().window().maximize();

        List<WebElement> username= driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username.get(1).sendKeys("John Doe");


        WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement button=driver.findElement(By.xpath("//button[@id='btn-login']"));
        button.click();

        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();

        ////input[@id='page-v1-step1-email']
        //input[@id='page-v1-step1-email' and @name='email' ]
        //input[@id='page-free-trial-step1-cu-gdpr-consent-checkbox']
        //button[text()='Create a Free Trial Account']






    }
}
