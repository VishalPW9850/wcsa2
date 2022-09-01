package actionClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMtd {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
	WebElement sourceField = driver.findElement(By.xpath("//li[@name='A']"));
	WebElement target = driver.findElement(By.xpath("//li[@name='G']"));
	Actions act = new Actions(driver);
	Thread.sleep(1000);
	act.dragAndDrop(sourceField, target).perform();
}
}
