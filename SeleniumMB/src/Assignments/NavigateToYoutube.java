package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToYoutube {

	public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.youtube.com/");
				Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rafta rafta song");

		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement( By.xpath("//yt-formatted-string[@aria-label='Rafta Rafta - Official Music Video | Raj Ranjodh | Atif Aslam Ft. Sajal Ali | Tarish Music by Tarish Music 99,363,626 views 2 years ago 3 minutes, 33 seconds']")).click();	



	}

}
