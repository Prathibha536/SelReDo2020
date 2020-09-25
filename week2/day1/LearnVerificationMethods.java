package week2.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnVerificationMethods {
	
	public static void main(String[] args)
	{

	    WebDriverManager.chromedriver().setup();
	    
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
		String text = driver.findElementByTagName("h2").getText();
		
		System.out.println(text);
		
		String attribute = driver.findElementById("username").getAttribute("class");
		
		System.out.println(attribute);
		
		Dimension size = driver.findElementById("decorativeSubmit").getSize();
		
		System.out.println(size);
		
		size.getWidth();
		size.getHeight();
		
		
		Point location = driver.findElementById("decorativeSubmit").getLocation();
		
		System.out.println(location);
		
		location.getX();
		
		location.getY();

		boolean enabled = driver.findElementById("decorativeSubmit").isEnabled();
		
		if(enabled == true)
		{
			System.out.println("Is enabled");
			
		}
		
		else {
			System.out.println("Element is not enabled");
		}
		

	}

}
