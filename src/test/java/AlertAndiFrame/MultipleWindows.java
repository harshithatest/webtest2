package AlertAndiFrame;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//*[text()='Services']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@title='Text resume']")).click();
		String parent=driver.getWindowHandle();
		Set<String> childs=driver.getWindowHandles();
		System.out.print(childs);
		List<String> child=new ArrayList<>(childs);
		driver.switchTo().window(child.get(1));
		driver.findElement(By.xpath("//*[@id='login_Layer']")).click();
		driver.close();
		driver.switchTo().window(parent);
		driver.close();
		
	}

}
