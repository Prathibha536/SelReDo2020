package week2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//dropdown1
		
		WebElement element = driver.findElementById("dropdown1");
		
		Select dropdown1 = new Select(element);
		
		dropdown1.selectByIndex(3);
		
		Thread.sleep(1000);
		
		//dropdown 2
		
		WebElement element2 = driver.findElementByName("dropdown2");
		
		Select dropdown2 = new Select(element2);
		
		dropdown2.selectByVisibleText("Selenium");
		
		Thread.sleep(1000);
		
		//dropdown3
		
		WebElement element3 = driver.findElementById("dropdown3");
		
		Select dropdown3 = new Select(element3);
		
		dropdown3.selectByValue("4");
		
		Thread.sleep(1000);
		
		//dropdown4
		
		WebElement element4 = driver.findElementByClassName("dropdown");
		
		Select dropdown4 = new Select(element4);
		
		List<WebElement> options = dropdown4.getOptions();
		
		int size = options.size();
		
		System.out.println("The number of options: " +size);
		
		WebElement element6 = driver.findElementByXPath("//select[@class = 'dropdown']");
		
		Select dropdown5 = new Select(element6);
		
		List<WebElement> options2 = dropdown5.getOptions();
		
		for (WebElement ele : options2) 
		
		{
			System.out.println("The Options in dd are: " +ele.getText());
		}
		
		//dropdown 5
		
		driver.findElementByXPath("(//div[@class = 'example'])[5]/select").sendKeys("Appium");
		
		//dropdown 6
		
		WebElement element8 = driver.findElementByXPath("(//div[@class = 'example'])[6]/select");
		
		Select dd1 = new Select(element8);
		
		dd1.selectByIndex(2);
		dd1.selectByIndex(1);
		dd1.selectByVisibleText("Loadrunner");
		
		
		driver.quit();
		
		
		

	}

}
