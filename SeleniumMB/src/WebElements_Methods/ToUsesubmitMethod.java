package WebElements_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsesubmitMethod {

	public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.instagram.com/");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("jyoti123@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("Das@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).submit();


	}

}
