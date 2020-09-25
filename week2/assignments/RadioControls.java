package week2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioControls {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.findElementById("yes").click();
		
		boolean selected = driver.findElementByXPath("//label[@for = 'Checked']/input").isSelected();
		
		if(selected == true)
			
		{
			System.out.println("The button checked is selected");
		}
		
		else 
		{
			System.out.println("Not selected");
		}
		
		boolean check = driver.findElementByXPath("(//input[@name = 'age'])[2]").isSelected();
		
		if(check == true)
		{
			System.out.println("The button is already selected");
		}
		else
		{
			driver.findElementByXPath("(//input[@name = 'age'])[2]").click();
		}
		
		driver.quit();
	}
	

}
