package week2.assignments;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		//Home Image code
		
		driver.findElementByXPath("//img[@src = '../images/home.png']").click();
		
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		
		String actualtitle = "TestLeaf - Selenium Playground";
		
		
		if(title.contains(actualtitle))
			
		{
			System.out.println("Navigated to correct page");
		}
		else
		{
			System.out.println("Navigated to wrong page");
		}
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		//Error Image
		
		driver.findElementByXPath(" //img[@src = '../images/abcd.jpg']").click();
				
		String title2 = driver.getTitle();
		
		System.out.println(title2);	
		
		String expected = "HTTP Status 404 – Not Found";
		
		if(title2.contains(expected))
			
		{
			System.out.println("Link is working fine");
		}
		else
		{
			System.out.println("Link is broken");
		}
		
		
		
	    Thread.sleep(1000);
	    
	    // keyboard /mouse action
		
		WebElement Image = driver.findElementByXPath("//img[@src = '../images/keyboard.png']");
		
		Actions clickaction = new Actions(driver);
		
		clickaction.moveToElement(Image);
		
		clickaction.click(Image).perform();
		
		String title3 = driver.getTitle();
		
				
		String expectedtitle = "TestLeaf - Selenium Playground";
		
		if(title3.contains(expectedtitle))
		{
			System.out.println("Navigated to correct page");
		}
		else
		{
			System.out.println("Lead to wrong page");
		}
		
	
		
		driver.quit();	
	
		
	}

}
