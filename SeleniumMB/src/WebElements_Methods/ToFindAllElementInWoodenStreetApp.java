package WebElements_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindAllElementInWoodenStreetApp {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.woodenstreet.com/");
	for(;;) {
try {
driver.findElement(By.id("loginclose1")).click();
break;
}catch(Exception e) {
	Thread.sleep(2000);
}
	}
 List<WebElement> allElMT = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
for(WebElement ele:allElMT)
	System.out.println(ele.getText());
	}
}