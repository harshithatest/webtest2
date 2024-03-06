package AlertAndiFrame;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		 WebElement scrolEle=driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scrolEle);
	      scrolEle.click();
	      Thread.sleep(5000);
	      WebElement scrolEle2=driver.findElement(By.xpath("//*[text()='Frames']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scrolEle2);
	      driver.findElement(By.xpath("//*[text()='Browser Windows']")).click();
	      String mainWindow= driver.getWindowHandle();
	      driver.findElement(By.id("windowButton")).click();
	      
	    Set<String> allWindows=  driver.getWindowHandles();
	    
	    for(String w:allWindows) {
		  
		   if(!w.equals(mainWindow)) {
			   driver.switchTo().window(w);
			   driver.findElement(By.id("sampleHeading")).isDisplayed();
			   Thread.sleep(2000);
			   driver.close();
		   }
	   }
	   driver.switchTo().window(mainWindow);
	   Thread.sleep(2000);
	   driver.findElement(By.id("tabButton")).click();
	   Set<String> allWindows2=  driver.getWindowHandles();
	   for(String w:allWindows2) {
		  
		   if(!w.equals(mainWindow)) {
			   driver.switchTo().window(w);
			   driver.findElement(By.id("sampleHeading")).isDisplayed();
			   Thread.sleep(2000);
			   driver.close();
		   }
	   }driver.switchTo().window(mainWindow);
	   driver.findElement(By.id("messageWindowButton")).click();
	   Set<String> allWindows3=  driver.getWindowHandles();
	   for(String w:allWindows3) {
			  
		   if(!w.equals(mainWindow)) {
			   driver.switchTo().window(w);
			String ele2=   driver.getTitle();
			   System.out.println(ele2);
			  // driver.findElement(By.id("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.")).isDisplayed();
			   Thread.sleep(2000);
			   driver.close();
		   }
	   }
	   driver.switchTo().window(mainWindow);
	   Thread.sleep(3000);
	   driver.close();
	}

}
