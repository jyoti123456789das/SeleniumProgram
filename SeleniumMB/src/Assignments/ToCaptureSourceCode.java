package Assignments;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

		public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
		 String sourcecode = driver.getPageSource();
		 System.out.println(sourcecode );
			}

	}


