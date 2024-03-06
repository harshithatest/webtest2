package Java.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormProj {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");


	        WebDriver driver = new ChromeDriver();

	        driver.get("https://demoqa.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        
	        //scroll to element
	        WebElement scrolEle=driver.findElement(By.xpath("//*[text()='Elements']"));
	        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scrolEle);
	        scrolEle.click();
	        
	        driver.findElement(By.xpath("//*[text()='Text Box']")).click();
	        WebElement ele= driver.findElement(By.xpath("//input[@id='userName']"));
	        //explicit wait
	        WebDriverWait wait= new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.visibilityOf(ele));
	       ele.sendKeys("abc");
	       
	       //scrolldown
	       WebElement scrolEle2=driver.findElement(By.id("submit"));
	       ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       
	        wait.until(ExpectedConditions.elementToBeClickable(scrolEle2));
	       scrolEle2.click();
	       
	       WebElement ele2=driver.findElement(By.xpath("//*[@id='name']"));
	     System.out.println(ele2.isDisplayed());//returns true
	      driver.close();
	   
	        
	}

}
