package Assignments;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenBaskinRobbinApp {
        public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		String titelOfwebpage = driver.getTitle();
		System.out.println(titelOfwebpage);


	}

}
