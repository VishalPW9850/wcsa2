package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIhpO54sKs-QIVjw4rCh08TAjgEAAYASAAEgIukfD_BwE");
	driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	WebElement sel = driver.findElement(By.xpath("//a[@title='Jewellery']"));
	Actions op = new Actions(driver);
	Thread.sleep(2000);
	op.moveToElement(sel).perform();
	driver.findElement(By.xpath("//a[.='Kadas']")).click();
	Thread.sleep(2000); 
	String text = driver.findElement(By.cssSelector("h1[class*='title title']")).getText();
	System.out.println(text);
}
}
