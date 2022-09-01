package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.get("https://www.google.com");
		//WebElement clk = driver.findElement(By.cssSelector("input[name='q']"));
//		clk.sendKeys("Lonavala");
//		Actions action = new Actions(driver);
//		action.doubleClick(clk).perform();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input[name*='txtU']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name*='txtP']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[name='Submit']")).click();
		driver.findElement(By.xpath("//b[.='PIM']")).click();
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		WebElement clk = driver.findElement(By.xpath("//input[@name='photofile']"));
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.doubleClick(clk).perform();
		
	}

}
