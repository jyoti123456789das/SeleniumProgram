package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WihoutUsingThreadsleep {

	public static void main(String[] args) {
	WebDriver driver = new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.name("username")).sendKeys("RadhaKrishna");
	driver.findElement(By.name("password")).sendKeys("RadhaKrishna");
	

	}

}
