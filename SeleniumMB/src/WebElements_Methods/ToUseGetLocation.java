package WebElements_Methods;
import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetLocation {

	
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				Thread.sleep(3000);
		 Point webelementLocation = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
		 System.out.println(webelementLocation);
		 System.out.println(webelementLocation.getY());
		System.out.println(webelementLocation.getX());

	}

}
