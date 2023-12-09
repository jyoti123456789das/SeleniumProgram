package WebElements_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetsize {

	public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				Thread.sleep(3000);
		 Dimension webelement = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
		 System.out.println(webelement);
		System.out.println(webelement.getHeight());
		System.out.println(webelement.getWidth());


	}

}
