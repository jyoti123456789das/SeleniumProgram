package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDemoWebShop {

	  public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(3000);
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.name("Gender")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("FirstName")).sendKeys("Krishna");
				Thread.sleep(2000);
				driver.findElement(By.name("LastName")).sendKeys("Madhav");
				Thread.sleep(2000);
				driver.findElement(By.name("Email")).sendKeys("Krishna@Radha");
				Thread.sleep(2000);
				driver.findElement(By.name("Password")).sendKeys("RadhaKrishna");
				Thread.sleep(2000);
				driver.findElement(By.name("ConfirmPassword")).sendKeys("RadhaKrishna");
				Thread.sleep(2000);
				driver.findElement(By.name("register-button")).click();



	}

}
