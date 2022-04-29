package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Aysha");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Patkar");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("div");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("patkar");
		
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		
		driver.findElement(By.name("description")).sendKeys("LearningSelenium");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("aysha.patkar95@gmail.com");
		
		WebElement dropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select Province = new Select(dropDown);
		
		Province.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("Pay attention here");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = driver.getTitle();
		
		System.out.println("The title of new page is "+title);
	}
}
