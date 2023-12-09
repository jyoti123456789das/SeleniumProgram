package Assignments;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDominos {

	public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://pizzaonline.dominos.co.in/");
		driver.manage().window().setSize(new Dimension(800, 800));


	}

}
