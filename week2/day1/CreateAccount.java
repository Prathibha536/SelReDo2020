package week2.day1;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateAccount {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		// Code to open chrome driver
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Accounts").click();
		
		driver.findElementByLinkText("Create Account").click();
		
		driver.findElementByXPath("//input[@id = 'accountName']").sendKeys("Debit Limited Account");
		
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		
		driver.findElementByXPath("//input[@id = 'groupNameLocal']").sendKeys("Pranay");
		
		driver.findElementByXPath("//input[@id ='officeSiteName']").sendKeys("Chennai");
		
		//Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		
		driver.findElementByXPath("(//input[@class ='inputBox'])[5]").sendKeys("12345");
		
		WebElement source = driver.findElementByName("industryEnumId");
		
		Select dropDown = new Select(source);
		
		dropDown.selectByVisibleText("Computer Software");
		
		WebElement source1 = driver.findElementByName("ownershipEnumId");
		
		Select dropDown1 = new Select(source1);
		
		dropDown1.selectByVisibleText("S-Corporation");
		
		WebElement source2 = driver.findElementByXPath("(//select[@class ='inputBox'])[4]");
		
		Select dropDown2 = new Select(source2);
		
		dropDown2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement source3 = driver.findElementById("marketingCampaignId");
		
		Select dropDown3 = new Select(source3);
		
		dropDown3.selectByIndex(6);
		
		WebElement source4 = driver.findElementById("generalStateProvinceGeoId");
		
		Select dropDown4 = new Select(source4);
		
		dropDown4.selectByValue("TX");
		
		driver.findElementByXPath("//input[@value= 'Create Account']").click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		}

}
