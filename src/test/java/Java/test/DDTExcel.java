package Java.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DDTExcel {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //WebDriver driver=new EdgeDriver();
        driver.get("https://www.udemy.com/join/login-popup/");
    }

    @Test
    public void DemoProject() throws InterruptedException {

        //initiallizing the browser

        driver.findElement(By.name("email")).sendKeys("harshitha95959@gmail.com");
        driver.findElement(By.name("password")).sendKeys("1234567890");
        driver.findElement(By.xpath("//button[@type='submit']/span['Log in']")).click();
        driver.close();

    }
}