package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
public class ToUseQuitMethods {
		public static void main(String[] args) throws InterruptedException {
					ChromeDriver driver =new ChromeDriver();
					driver.get("https://www.instagram.com/");
					Thread.sleep(5000);
					driver.quit();
						}

	}


