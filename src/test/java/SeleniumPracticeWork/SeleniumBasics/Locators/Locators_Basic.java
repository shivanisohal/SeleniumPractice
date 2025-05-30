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

public class Locators_Basic {
    @Description(" #TC1 Verify Invalid Login and Check Error")
    @Owner("Shivani")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void InvalidLogin() throws InterruptedException {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver =new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement Username_Input=driver.findElement(By.id("login-username"));
        Username_Input.sendKeys("admin@admin.com");

        WebElement Password_Input=driver.findElement((By.name("password")));
        Password_Input.sendKeys("Password");

        WebElement Submitbtn= driver.findElement(By.id("js-login-btn"));
        Submitbtn.click();

        Thread.sleep(3000);

        WebElement erroemsg=driver.findElement(By.className("notification-box-description"));
        System.out.println(erroemsg.getText());

        Assert.assertEquals(erroemsg.getText(),"Your email, password, IP address or location did not match");



        driver.quit();






    }
}
