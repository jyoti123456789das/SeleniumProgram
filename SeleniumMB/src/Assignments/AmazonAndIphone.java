package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAndIphone {

			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		 WebElement checkbox = driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']"));
		System.out.println(checkbox.isDisplayed() );
		checkbox.click();
		System.out.println(checkbox.isSelected() );
		System.out.println(checkbox.isEnabled() );

	}

}
