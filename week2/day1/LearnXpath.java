package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		// Code to open chrome driver
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		/*driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();*/
		
		driver.findElementByXPath("//input[@name ='USERNAME']").sendKeys("demosalesmanager");
		
		driver.findElementByXPath("(//input[@class ='inputLogin'])[2]").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@type ='submit']").click();
		
		//driver.findElementByXPath("//a[@style= 'color: black;']").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		
		
		
		
		
		
		
		
	}

}
