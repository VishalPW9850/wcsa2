package robotClassMth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.event.KeyEvent;	

public class PressAndReleaseMtd {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=EAIaIQobChMIp5LkoYav-QIViBBgCh2DtQFoEAAYASAAEgIWUvD_BwE&gclid=EAIaIQobChMIp5LkoYav-QIViBBgCh2DtQFoEAAYASAAEgIWUvD_BwE");
	driver.findElement(By.cssSelector("div[style*='-radius: 14px;']")).click();
	WebElement clk = driver.findElement(By.cssSelector("h2[class*='neutral-400']"));
	Actions action = new Actions(driver);
	action.doubleClick(clk).perform();
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_C);
	
	driver.findElement(By.cssSelector("input[class$='-500 bg-transparent bc-secondary-500 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null']"));
	
	
	
	
  }
}
