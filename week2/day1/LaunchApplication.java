package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
		
		// To set the path for the driver
		// Code to open chrome driver
		
		WebDriverManager.chromedriver().setup();		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		//driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByPartialLinkText("CRM").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Serendebyte");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Prathi");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Pradeep");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dropDown = new Select(source);
		
		dropDown.selectByVisibleText("Direct Mail");
		
		//dropDown.selectByValue("LEAD_EMPLOYEE");
		
		//dropDown.selectByIndex(1);
		
		WebElement source1 = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dropDown1 = new Select(source1);
		
		dropDown1.selectByValue("9001");
		
		WebElement source2 = driver.findElementById("createLeadForm_industryEnumId");
		
		Select dropDown2 = new Select(source2);
		
		List<WebElement> Options = dropDown2.getOptions();
		
		int size = Options.size();
		
		dropDown2.selectByIndex(size-2);
		
		WebElement source3 = driver.findElementById("createLeadForm_ownershipEnumId");
		
		Select dropDown3 = new Select(source3);
		
		dropDown3.selectByIndex(5);
 		
		WebElement source4 = driver.findElementById("createLeadForm_generalCountryGeoId");
		
		Select  dropDown4 = new Select(source4);
		
		dropDown4.selectByVisibleText("India");
		
		driver.findElementByName("submitButton").click();
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
