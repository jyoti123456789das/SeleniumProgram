package WebDriverMethods;

		import org.openqa.selenium.chrome.ChromeDriver;

		public class ToUseGetMethod {
			public static void main(String[] args)  throws InterruptedException{
				
			
				
			
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
			}
		

	}


