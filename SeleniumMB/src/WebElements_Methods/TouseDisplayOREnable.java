package WebElements_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TouseDisplayOREnable {

	
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				/*driver.get("https://www.instagram.com/");
				Thread.sleep(3000);
				/*System.out.println("Before entering the data");
				 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		System.out.println("================");
		System.out.println("After entering the data");
		driver.findElement(By.name("username")).sendKeys("9861770867");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Das@12345");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());*/
				driver.get("https://demoapp.skillrary.com/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//option[@value='99']"));

	}

}
