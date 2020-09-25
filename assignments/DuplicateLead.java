package week2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		
		driver.findElementByXPath("//span[text() = 'Email']").click();
		
		driver.findElementByXPath("//input[@name = 'emailAddress']").sendKeys("gopinath@testleaf.com");
		
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		
		Thread.sleep(2000);
		
		String name = driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
		
		System.out.println(name);
		
		driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
		
		driver.findElementByLinkText("Duplicate Lead").click();
		
		String title = driver.getTitle();
		
		if(title.contains("Duplicate Lead"))
		{
			System.out.println("Landed to correct page");
		}
		else
		{
			System.out.println("Landed to wrong page");
		}
		
		
		driver.findElementByXPath("//input[@name = 'submitButton']").click();
		
		String dupname = driver.findElementById("viewLead_firstName_sp").getText();
		
		System.out.println(dupname);
		
		if(name.equalsIgnoreCase(dupname))
		{
			System.out.println("Lead is duplicate");
		}
		else
		{
			System.out.println("Lead is not duplicate");
		}
		
		driver.quit();
		
			}

}
