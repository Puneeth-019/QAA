package ifa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Profile_info {
	@Test
	void profile()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://qa.ifaclick.com/leads");

		driver.findElement(By.id("email"))
		      .sendKeys("venkatesh.prasad@techcanopy.com");
		driver.findElement(By.id("password"))
		      .sendKeys("Manuvenky7#");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//span[text()='Leads']")));
		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//div[text()='Puneeth']")));
		driver.findElement(By.xpath("//div[text()='Puneeth']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//button[text()='Profile Info']")));
		driver.findElement(By.xpath("//button[text()='Profile Info']")).click();
		driver.findElement(By.xpath("//button[text()=' Edit']")).click();
		
//PERSONAL INFORMATION
		 driver.findElement(By.xpath(" //*[@id='pi-dob']")).clear();
		 driver.findElement(By.xpath(" //*[@id='pi-dob']")).sendKeys("20-3-2004");
		 
				WebElement genderDropdown = wait.until(ExpectedConditions.elementToBeClickable(
					    By.xpath("//*[text()='Gender ']/following::button[1]")));
					genderDropdown.click();
			   driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
			   driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
			   driver.switchTo().activeElement().sendKeys(Keys.ENTER);  
	 driver.findElement(By.xpath(" //*[@id='pi-pan']")).clear();		   
	 driver.findElement(By.xpath(" //*[@id='pi-pan']")).sendKeys("QJTKC3971K");
		WebElement edu  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Education']/following::button[1]")));
	edu.click(); 
	driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
	driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
    driver.switchTo().activeElement().sendKeys(Keys.ENTER);  
	
	WebElement inv  = wait.until(ExpectedConditions.elementToBeClickable(
		By.xpath("//*[text()='Investment Horizon (Holding Period)']/following::button[1]")));
		inv.click(); 
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(" //*[@id='pi-income']")).clear();
		driver.findElement(By.xpath(" //*[@id='pi-income']")).sendKeys("1400000");
	
		WebElement exp  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Investing Experience']/following::button[1]")));
				exp.click(); 
				driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
				driver.switchTo().activeElement().sendKeys(Keys.ENTER);
				
	
				WebElement occupation  = wait.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//*[text()='Occupation ']/following::button[1]")));
				occupation.click(); 
				driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
				driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
				driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
				driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
			    driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
			    driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
				driver.switchTo().activeElement().sendKeys(Keys.ENTER);
						
				driver.findElement(By.xpath(" //*[@id='pi-addressLine1']")).clear();
				driver.findElement(By.xpath(" //*[@id='pi-addressLine1']")).sendKeys("bengaluru");
				driver.findElement(By.xpath(" //*[@id='pi-addressLine2']")).clear();
				driver.findElement(By.xpath(" //*[@id='pi-addressLine2']")).sendKeys("RR Nagar");
				driver.findElement(By.xpath(" //*[@id='pi-addressCity']")).clear();
				driver.findElement(By.xpath(" //*[@id='pi-addressCity']")).sendKeys("bengaluru");
				driver.findElement(By.xpath(" //*[@id='pi-addressState']")).clear();
				driver.findElement(By.xpath(" //*[@id='pi-addressState']")).sendKeys("karnataka");
				driver.findElement(By.xpath(" //*[@id='pi-addressCountry']")).clear();
				driver.findElement(By.xpath(" //*[@id='pi-addressCountry']")).sendKeys("India");
				driver.findElement(By.xpath(" //*[@id='pi-addressZip']")).clear();
				driver.findElement(By.xpath(" //*[@id='pi-addressZip']")).sendKeys("560098");
	


WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
driver.findElement(By.xpath("//div[text()='Personal Information']/following::button[2]")).click();

wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Personal information saved successfully.']")));
}
	@Test
void kyc()
{	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://qa.ifaclick.com/leads");

	driver.findElement(By.id("email"))
	      .sendKeys("venkatesh.prasad@techcanopy.com");
	driver.findElement(By.id("password"))
	      .sendKeys("Manuvenky7#");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
	    By.xpath("//span[text()='Leads']")));
	driver.findElement(By.xpath("//span[text()='Leads']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//div[text()='Suresh Patil']")));
	driver.findElement(By.xpath("//div[text()='Suresh Patil']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//button[text()='Profile Info']")));
	driver.findElement(By.xpath("//button[text()='Profile Info']")).click();
driver.findElement(By.xpath("//button[text()=' Edit']//parent::div/div[text()='KYC Information']//following::button[1]")).click();
	
//KYC INFORMATION
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement status  = wait1.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Tax Status ']/following::button[1]")));
	status.click(); 
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(" //*[@id='pi-placeOfBirth']")).clear();
		driver.findElement(By.xpath(" //*[@id='pi-placeOfBirth']")).sendKeys("Bengaluru");

		driver.findElement(By.xpath("//*[@id='kycAddress']")).click();

		driver.findElement(By.xpath("//div[contains(text(),'KYC Information')]/following::button[2]")).click();
}
	@Test
void bank_details()
{

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://qa.ifaclick.com/leads");

driver.findElement(By.id("email"))
      .sendKeys("venkatesh.prasad@techcanopy.com");
driver.findElement(By.id("password"))
      .sendKeys("Manuvenky7#");
driver.findElement(By.xpath("//button[@type='submit']")).click();


WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(
    By.xpath("//span[text()='Leads']")));
driver.findElement(By.xpath("//span[text()='Leads']")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(
	    By.xpath("//div[text()='Suresh Patil']")));
driver.findElement(By.xpath("//div[text()='Suresh Patil']")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(
	    By.xpath("//button[text()='Profile Info']")));
driver.findElement(By.xpath("//button[text()='Profile Info']")).click();

//BANK DETAILS
driver.findElement(By.xpath("//div[contains(text(),'Bank Details')]/following::button[2]")).click();
driver.findElement(By.xpath(" //*[@id='bank-acc-0']")).clear();
		driver.findElement(By.xpath(" //*[@id='bank-acc-0']")).sendKeys("2353625486325");
		driver.findElement(By.xpath(" //*[@id='bank-name-0']")).clear();
		driver.findElement(By.xpath(" //*[@id='bank-name-0']")).sendKeys("BOB");
		driver.findElement(By.xpath(" //*[@id='bank-ifsc-0']")).clear();
		driver.findElement(By.xpath(" //*[@id='bank-ifsc-0']")).sendKeys("BARB0VMDJE");
		
		
	
			WebElement acc  = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//*[text()='Account Type ']/following::button[1]")));
		acc.click(); 
			
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("file-0")));
			fileInput.sendKeys("C:\\\\Users\\\\VICTUS\\\\Downloads\\\\user_performance_This Week.pdf"); 
			driver.findElement(By.xpath("//div[contains(text(),'Bank Details')]/following::button[3]")).click();
			
}	
	@Test
void nominee_details()
{		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://qa.ifaclick.com/leads");

		driver.findElement(By.id("email"))
		      .sendKeys("venkatesh.prasad@techcanopy.com");
		driver.findElement(By.id("password"))
		      .sendKeys("Manuvenky7#");
		driver.findElement(By.xpath("//button[@type='submit']")).click();


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//span[text()='Leads']")));
		driver.findElement(By.xpath("//span[text()='Leads']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//div[text()='Suresh Patil']")));
		driver.findElement(By.xpath("//div[text()='Suresh Patil']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//button[text()='Profile Info']")));
		driver.findElement(By.xpath("//button[text()='Profile Info']")).click();
		driver.findElement(By.xpath("//*[text()='Nominee Details']//following::button[text()=' Edit']")).click();
		
//NOMINEE DETAILS
		driver.findElement(By.xpath(" //*[@id='nom-nomineeName-0']")).clear();
			driver.findElement(By.xpath(" //*[@id='nom-nomineeName-0']")).sendKeys("Rakesh");
			driver.findElement(By.xpath(" //*[@id='nom-nomineeDOB-0']")).clear();
			driver.findElement(By.xpath(" //*[@id='nom-nomineeDOB-0']")).sendKeys("19-3-2004");
			WebElement id  = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//*[text()='ID Proof ']/following::button[1]")));	
			id.click(); 
			driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			driver.findElement(By.xpath(" //*[@id='nom-nomineeIdProof-0']")).sendKeys("804485459952");
		
				WebElement rel  = wait.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//*[text()='Relationship ']/following::button[1]")));		
				rel.click(); 
				driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
				driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
				driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
				driver.switchTo().activeElement().sendKeys(Keys.ENTER);
				
				driver.findElement(By.xpath("//button[@id='nom-nomineeAddress-0']")).click();
				driver.findElement(By.xpath("//div[contains(text(),'Nominee Details')]/following::button[3]")).click();
				

	}
}

//driver.switchTo().activeElement().sendKeys(Keys.HOME); // goes to first option
//driver.switchTo().activeElement().sendKeys(Keys.ENTER);
