package DropdownMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUseSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.facebook.com/signup");
	//dropdown
	 WebElement dayDropdown = driver.findElement(By.id("day"));
	 WebElement monthDropdown = driver.findElement(By.id("month"));
	 WebElement yearDropdown = driver.findElement(By.id("year"));
	 
	 //select class to handle 
	 Select dayselect = new Select(dayDropdown);
	 Select monthselect = new Select(monthDropdown);
	 Select yearselect = new Select(yearDropdown);
	  
	 //call the methods
	 dayselect.selectByIndex(3);
	 monthselect.selectByValue("2");
	 yearselect.selectByVisibleText("2000");
	 //To fetch all options
	List<WebElement> allmonths = monthselect.getOptions();
	 for(WebElement month:allmonths) {
		 System.out.println(month.getText());
		 monthselect.selectByVisibleText(month.getText());
		 Thread.sleep(1000);
	 }
	}

}
