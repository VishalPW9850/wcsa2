package selectionHandlingTheDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleValueMtd {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Shree/Desktop/html/singleselectdropdown.html");
	WebElement ssdd = driver.findElement(By.id("menu"));
	Select sel = new Select(ssdd);
	Thread.sleep(2000);
	sel.selectByVisibleText("shira");
	
	
	
}
}
