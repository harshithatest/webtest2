package Java.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForm {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");


	      WebDriver driver = new ChromeDriver();

	      driver.get("https://demoqa.com/");
	      driver.manage().window().maximize();
	      //scroll to element
	      WebElement scrolEle=driver.findElement(By.xpath("//*[text()='Forms']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scrolEle);
	      scrolEle.click();
	      //practice form
	      WebElement practiceform=driver.findElement(By.xpath("//*[text()='Practice Form']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",practiceform);
	      practiceform.click();
	      driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("user");
	      driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("user@gmail.com");
	      WebElement ele = driver.findElement(By.id("gender-radio-2"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	      WebDriverWait wait= new WebDriverWait(driver,2);
	      wait.until(ExpectedConditions.elementToBeClickable(ele));
	     ele.click();
	      driver.findElement(By.id("userNumber")).sendKeys("0987654321");
	      driver.findElement(By.id("dateOfBirthInput")).click();
	      WebElement ele2= driver.findElement(By.className("react-datepicker__month-select"));
	      WebElement ele3=driver.findElement(By.className("react-datepicker__year-select"));
	      
	      //select by index
	      Select sel=new Select(ele2);
	      sel.selectByIndex(1);
	      //select by value
	      Select sel2=new Select(ele3);
	      
	      sel2.selectByValue("2000");
	      driver.findElement(By.className("//*[text()='13']")).click();
	}

}
