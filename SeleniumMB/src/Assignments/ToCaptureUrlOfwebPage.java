package Assignments;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrlOfwebPage {
	public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://online.kfc.co.in/");
		 String url = driver.getCurrentUrl();
		 System.out.println(url);

	}

}
