package Java.test;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demo1 {


    WebDriver driver;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.easemytrip.com/");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
    @Test
    public void code(){
        driver.findElement(By.xpath("//span[text()='Flights']")).click();
    }
}
