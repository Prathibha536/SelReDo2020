package week2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//Select the languages that you kno
		
		driver.findElementByXPath("(//input[@type = 'checkbox'])[1]").click();
		
		//Select the languages that you kno
		
		boolean enabled = driver.findElementByXPath("(//label[ text() = 'Confirm Selenium is checked']/following::input)[1]").isEnabled();

		if(enabled == true)
		{
			System.out.println("The checkbox is already selected");
		}
		else
		{
			System.out.println("Not selected");
		}
		
		//DeSelect only checked
		
		boolean selected = driver.findElementByXPath("(//label[ text() = 'Confirm Selenium is checked']/following::input)[3]").isSelected();
		
		if(selected == true)
		{
			driver.findElementByXPath("(//label[ text() = 'Confirm Selenium is checked']/following::input)[3]").click();
		}
		
		else 
		{
		System.out.println("its not selected");	
		}
		
		//Select all below checkboxes
		
		List<WebElement> list = driver.findElementsByXPath("(//div[contains(text(),'Option')]/input)");
		
	    for (WebElement ele : list) {
	    	
	    	if(ele.isSelected()== false)
	    	{
	    		ele.click();
	    	}
	    	
	    	driver.quit();
			
		}	
			
		}
			
		
		}
		
		
			
	


