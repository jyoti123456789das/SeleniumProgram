package DropdownMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapp.skillrary.com/");
		 WebElement listbox = driver.findElement(By.id("cars"));

		//select class
		Select multiselect = new Select(listbox);
		System.out.println(multiselect .isMultiple());
		
		//To select
		
		multiselect.selectByIndex(0);
		multiselect.selectByValue("199");
		Thread.sleep(1000);
		
		//deselect
	//	multiselect.selectByIndex(0);
	//multiselect.selectByValue("199");
		multiselect.deselectAll();
	}

}
