package week2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.findElementByLinkText("Go to Home Page").click();
		
		String str = driver.getTitle();
		
		if(str.contains("TestLeaf"))
		{
			System.out.println("Landed in home page");
		}
		else
		{
			System.out.println("landed in wrong page");
		}
		driver.navigate().back();
		
		driver.findElementByXPath("//a[text() = 'Find where am supposed to go without clicking me?']");
		
		driver.navigate().to("http://leafground.com/pages/Button.html");
		
		String str1 = driver.getTitle();
		
		System.out.println("The title of navigated page is: "+str1);
		
		driver.navigate().back();
		
		driver.findElementByXPath("//a[text() = 'Verify am I broken?']").click();
		
		String text = driver.findElementByXPath("//h1[text() = 'HTTP Status 404 – Not Found']").getText();
		
		if(text.contains("HTTP Status 404"))
		{
			System.out.println("The link is broken");
		}
		else
		{
			System.out.println("The link is not broken");
		}
		
		driver.navigate().back();
		
		//Thread.sleep(1000);
		
		driver.findElementByXPath("(//a[text() = 'Go to Home Page'])[2]").click();
		
		String title = driver.getTitle();
		
		System.out.println("Landed to home page: "+title);			
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//img[@src= 'images/link.png']").click();
		
		String title2 = driver.getTitle();
		
		System.out.println("Landed to current page: "+title2);
		
		driver.findElementByLinkText("How many links are available in this page?").click();
		
		List<WebElement> link = driver.findElementsByTagName("a");
		
		System.out.println("The number of links: " +link.size());
		
		driver.quit();			
		

	}

}
