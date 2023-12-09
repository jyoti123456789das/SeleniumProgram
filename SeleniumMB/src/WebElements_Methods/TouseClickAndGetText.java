package WebElements_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TouseClickAndGetText {

	
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/login/");

		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).getText();
			System.out.println(text);

	}

}
