package HandellingIframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11PassTheNumber {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.dream11.com/");
	//by using  frameindex
	//driver.switchTo().frame(0);
	
//	by using stringn id or name
	//driver.switchTo().frame("send-sms-iframe");
	
	 //by using webelement
	 WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
     driver.switchTo().frame(iframe);
	 driver.findElement(By.id("regEmail")).sendKeys("9337617475");
	 //By using switch back 
	 driver.switchTo().parentFrame();
	  driver.findElement(By.linkText("About Us")).click();

	}

}
