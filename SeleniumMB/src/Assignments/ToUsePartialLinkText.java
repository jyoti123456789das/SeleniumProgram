package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsePartialLinkText {
            public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
					driver.findElement(By.partialLinkText("Log in")).click();
					driver.findElement(By.name("Email")).sendKeys("jyotiranjan");
					driver.findElement(By.name("")).sendKeys("das");


	}

}
