package week2.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.findElementById("email").sendKeys("test@gmail.com");
		
		driver.findElementByXPath("//input[ @value = 'Append ']").sendKeys("Test");
		
			
		driver.findElementByXPath("//input[ @value = 'Append ']").sendKeys(Keys.TAB);
		
		WebElement value = driver.findElementByXPath("//input[@name='username']");
		
		//System.out.println(value);
		
		String str = value.getText();
		
		System.out.println("The text is: " +str);
		
		driver.findElementByXPath("//input[@value = 'Clear me!!']").clear();
		
		boolean enabled = driver.findElementByXPath("(//input[@type = 'text'])[last()]").isEnabled();
		
		if(enabled == true)
		{
			System.out.println("Text box is enabled");
		
	
		}
		
		else
		{
			System.out.println("Text box is not enabled");
		}
					
		
		driver.quit();
		
		
	}

}
