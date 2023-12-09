package Assignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountTotalNoOfLinkPresent {

	public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			Thread.sleep(1000);
			//count number of links
		  List<WebElement> images = driver.findElements(By.tagName("a"));
		System.out.println(images.size());


	}

}
