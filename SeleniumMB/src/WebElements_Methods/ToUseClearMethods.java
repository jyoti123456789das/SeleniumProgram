package WebElements_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethods {

	public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.vtiger.com/vtigercrm/");
			Thread.sleep(4000);
			 WebElement username = driver.findElement(By.id("username"));
			 username.clear();
			 username.sendKeys("jyotiranjan das");
			 WebElement pass = driver.findElement(By.id("password"));
			 pass.clear();
			 pass.sendKeys("Das@12345");
			 


	}

}
