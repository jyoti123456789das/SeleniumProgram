package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseReferenceVariableStore {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
        WebElement UN = driver.findElement(By.name("username"));
	UN.sendKeys("RadhaKrishna");
	UN.sendKeys(Keys.CONTROL +"a");
	UN.sendKeys(Keys.CONTROL +"c");
	Thread.sleep(2000);
	 WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys(Keys.CONTROL +"v"); 
	}

}
