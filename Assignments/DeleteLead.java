package  week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) {
		
		
		
	
	
	WebDriverManager.chromedriver().setup();
	// step 1:Launch the ChromeBrowser
	ChromeDriver driver = new ChromeDriver();
	// step 2:Launch the application
	// URL Loading(leafTap)
	driver.get("http://leaftaps.com/opentaps/control/login");
	// step3:To maximize the window
	driver.manage().window().maximize();
	// step 4:find the user name and value
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	// step5: Find the password and value
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	// step6:find the login button and click
	driver.findElement(By.className("decorativeSubmit")).click();
	// step7:Click the CRM/SFA
	driver.findElement(By.linkText("CRM/SFA")).click();
	// click the lead
	driver.findElement(By.linkText("Leads")).click();
	//	Click Find leads
	driver.findElement(By.linkText("Find Leads")).click();
	//Click on Phone
	driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Phone']")).click();
//Enter phone number
	driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneNumber']")).sendKeys("9876543210");
//	Click Find leads
	driver.findElement(By.linkText("Find Leads")).click();
	//Capture lead ID of First Resulting lead
	
	/*	
		7
		8	
		9	
		10	
		11	
		12	Click First Resulting lead
		driver.findElement(By.className("smallSubmit")).click();
		13	Click Delete
		driver.findElement(By.className("smallSubmit")).click();
		14	Click Find leads
		driver.findElement(By.className("smallSubmit")).click();
		15	Enter captured lead ID
		16	Click find leads button
		driver.findElement(By.className("smallSubmit")).click();
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/
	}
}