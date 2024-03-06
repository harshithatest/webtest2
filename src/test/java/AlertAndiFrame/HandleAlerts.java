package AlertAndiFrame;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerts {
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
	      driver.findElement(By.xpath("//*[text()='Alerts']")).click();
	      String mainWindow= driver.getWindowHandle();
	      driver.findElement(By.xpath("//*[@id='alertButton']")).click();
	      Thread.sleep(5000);
	   driver.switchTo().alert().accept();
	   driver.findElement(By.id("timerAlertButton")).click();
	   WebDriverWait wait= new WebDriverWait(driver,10);
	   wait.until(ExpectedConditions.alertIsPresent());
	 Alert alert=  driver.switchTo().alert();
	 String str=alert.getText();
	 System.out.print(str);
	 alert.accept();
	 driver.findElement(By.id("confirmButton")).click();
     Thread.sleep(5000);
  driver.switchTo().alert().dismiss();
  driver.findElement(By.xpath("//*[text()='Cancel']")).isDisplayed();
  
  driver.findElement(By.id("promtButton")).click();
  Thread.sleep(5000);
Alert Promtalert=driver.switchTo().alert();
Promtalert.sendKeys("hi");
Thread.sleep(5000);
Promtalert.accept();
	   driver.close();
	   

}
}