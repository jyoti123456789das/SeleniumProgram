package WebDriverMethods;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToCaptureURLOfWebPage1 {

	public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.instagram.com/");
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
			}

		

	}


