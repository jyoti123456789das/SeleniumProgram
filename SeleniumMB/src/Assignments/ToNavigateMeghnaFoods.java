package Assignments;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateMeghnaFoods {
        public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://meghanafoods.co.in/");
				driver.manage().window().setPosition(new Point(100, 50));


	}

}
