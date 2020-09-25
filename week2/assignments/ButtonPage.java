package week2.assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.findElementByXPath("//button[@id ='home']").click();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
			
		Point location = driver.findElementByXPath("//button[@id ='position']").getLocation();
		
		System.out.println(location);	
		
		
		String cssValue = driver.findElementByXPath("//button[@id ='color']").getCssValue("color");
		
		System.out.println(cssValue);
		
		Dimension size = driver.findElementByXPath("//button[@id ='size']").getSize();
		
		System.out.println(size);			
		
		driver.quit();
		
		
	}

}
