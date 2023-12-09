package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchElementAmazon {

	 public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			Thread.sleep(5000);
		driver.findElement(By.name("field-keywords")).sendKeys("BOOKS");


	}

}
