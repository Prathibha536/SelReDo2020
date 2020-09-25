package week2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
        
		WebDriverManager.chromedriver().setup();		
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
        driver.findElementByPartialLinkText("CRM").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByXPath("//a[ text() = 'Find Leads']").click();
		
		driver.findElementByXPath("(//input[@name = 'firstName'])[3]").sendKeys("Prathi");
		
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//a[contains(@href,'/crmsfa/control/viewLead?')]").click();
		
		String str = driver.getTitle();
		
		if(str.contains("View Lead"))
			
		{
			System.out.println("Navigated to View Lead page correctly");
		}
		
		else
		{
			System.out.println("Navigated to wrong page");
			
		}
		
		Thread.sleep(1000);
		driver.findElementByXPath("//a[text() = 'Edit']").click();
		
		driver.findElementById("updateLeadForm_companyName").clear();
		
		driver.findElementById("updateLeadForm_companyName").sendKeys("Companyupdate");
		
		driver.findElementByXPath("//input[@value = 'Update']").click();
		
	    String str1 = driver.findElementById("viewLead_companyName_sp").getText();
	    
	    System.out.println(str1);
	    
	    if (str1.contains("Companyupdate"))
	    {
	    	System.out.println("Company name been updated");
	    }
	    
	    else
	    {
	    	System.out.println("Company name not updated correctly");
	    }
		
	    driver.quit();				
		

	}

}
