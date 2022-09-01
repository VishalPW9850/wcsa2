package fileUploadActiTime;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-lt5ng4u/login.do");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	driver.findElement(By.xpath("(//td[@class='navItem relative']/descendant::a[@class='content administration_selected selected']")).click();
	driver.findElement(By.xpath("//a[@class='item active']")).click();
	driver.findElement(By.cssSelector("label[for*='NewLogo']")).click();
	driver.findElement(By.xpath("(//input[@type='file'])[1]")).click();
	
	File file = new File("./windowBasedHandling(Autoit)\\\\fe1.exe");
	String absPath = file.getAbsolutePath();
	Runtime.getRuntime().exec(absPath);
	Thread.sleep(5000);
	Runtime.getRuntime().exec(absPath);
	
}
}
