package WebDriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageMethods {

	
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver =new ChromeDriver();
//				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//TOMinimize The Browser
		//driver.manage().window().minimize();

		//To Fullscreen webpage
		//driver.manage().window().fullscreen();

		//TogetSize of webpage
		// Dimension sizeofwebpage = driver.manage().window().getSize();
		// System.out.println(sizeofwebpage);
		// System.out.println(sizeofwebpage.getHeight());
		// System.out.println(sizeofwebpage.getWidth());

		//To setsize
		//driver.manage().window().setSize(new Dimension(650, 500));

		//To getposition
		// Point pos = driver.manage().window().getPosition();
		//System.out.println(pos);

		//To set position
		driver.manage().window().setPosition(new Point(250, 200));


			}

		

	}


