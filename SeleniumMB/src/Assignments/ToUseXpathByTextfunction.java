package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByTextfunction {
            public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();

	}
 
}