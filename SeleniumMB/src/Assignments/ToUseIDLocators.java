package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIDLocators {
          public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.actitime.com/free-online-trial");
				Thread.sleep(3000);
				driver.findElement(By.id("FirstName")).sendKeys("jyotiranjan");
				Thread.sleep(2000);
				driver.findElement(By.id("LastName")).sendKeys("Das");
				Thread.sleep(2000);
				driver.findElement(By.id("Email")).sendKeys("Das@1234");
				Thread.sleep(2000);
				driver.findElement(By.id("Company")).sendKeys("Das company");


	}

}
