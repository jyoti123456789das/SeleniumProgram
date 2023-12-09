package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetValue {
            public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/login");
				Thread.sleep(4000);
		 WebElement login = driver.findElement(By.linkText("Log in"));
		System.out.println(login.getCssValue("    background"));
		System.out.println(login.getCssValue("font-family"));
		System.out.println(login.getCssValue("    color"));
		System.out.println(login.getCssValue("font-size"));


	}

}
