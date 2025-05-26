package SeleniumPracticeWork.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumBasic_2 {

    @Test
    public void Testmethod()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
    }
}
