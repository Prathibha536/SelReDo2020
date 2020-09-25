package week2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		driver.findElementByXPath("//span[text() = 'Phone']").click();
		
		driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("9884946200");
		
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		
		Thread.sleep(2000);
		
		String str = driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		
		System.out.println(str);			
		
		driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		Thread.sleep(4000);
		
		driver.findElementByXPath("//a[text() = 'Delete']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//a[ text() = 'Find Leads']").click();
		
		//driver.findElementByXPath("//input[@name='id']").sendKeys(str);
		
		driver.findElementByName("id").sendKeys(str);
		
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		
		//String str1 = driver.findElementByXPath("//div[text() = 'No records to display']").getText();
		
		String str1 = driver.findElementByClassName("x-paging-info").getText();
		
		Thread.sleep(1000);
		
		System.out.println(str1);
		
		Thread.sleep(1000);
		
		if(str1.equalsIgnoreCase("No records to display"))
		{
			System.out.println("The lead has been deleted");
		}
		
		else
		{
			System.out.println("Lead has not been deleted");
		}
		
		
		driver.quit();	
		

	}

}
