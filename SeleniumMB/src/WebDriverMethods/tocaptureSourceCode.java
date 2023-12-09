package WebDriverMethods;
import org.openqa.selenium.chrome.ChromeDriver;
public class tocaptureSourceCode {

	public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://skillrary.com/");
		 String sourcecode = driver.getPageSource();
		 System.out.println(sourcecode );
			}
		

	}


