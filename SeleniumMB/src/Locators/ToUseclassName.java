package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToUseclassName {

	
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				driver.findElement(By.className("email")).sendKeys("jyotiranjandas@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.className("pass")).sendKeys("Das@1234");

			}

		


	}


