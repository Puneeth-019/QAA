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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generate_reports {
	@Test
	void reports1()
	{
		WebDriverManager.chromedriver().setup();
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
		    By.xpath("//span[text()='Analytics & Reports']")));
		driver.findElement(By.xpath("//span[text()='Analytics & Reports']")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement categoryDropdown = wait2.until(ExpectedConditions.elementToBeClickable(By.id("report-type")));
		categoryDropdown.click();
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER);   

		driver.findElement(By.xpath("//*[@id='user']")).click();
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER); 
		 //*[@id='start-date']
		   driver.findElement(By.xpath(" //*[@id='start-date']")).sendKeys("20-9-2025");
		   driver.findElement(By.xpath(" //*[@id='end-date']")).sendKeys("20-10-2025");
		 //*[text()='Generate Report']
		   driver.findElement(By.xpath(" //*[text()='Generate Report']")).click();
}
	@Test
	void reports2()
	{
		WebDriverManager.chromedriver().setup();
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
		    By.xpath("//span[text()='Analytics & Reports']")));
		driver.findElement(By.xpath("//span[text()='Analytics & Reports']")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement categoryDropdown = wait2.until(ExpectedConditions.elementToBeClickable(By.id("report-type")));
		categoryDropdown.click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER);   

		driver.findElement(By.xpath("//*[@id='user']")).click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER); 
		 //*[@id='start-date']
		   driver.findElement(By.xpath(" //*[@id='start-date']")).sendKeys("20-9-2025");
		   driver.findElement(By.xpath(" //*[@id='end-date']")).sendKeys("20-10-2025");
		 //*[text()='Generate Report']
		   driver.findElement(By.xpath(" //*[text()='Generate Report']")).click();
}
	@Test
	void reports3()
	{
		WebDriverManager.chromedriver().setup();
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
		    By.xpath("//span[text()='Analytics & Reports']")));
		driver.findElement(By.xpath("//span[text()='Analytics & Reports']")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement categoryDropdown = wait2.until(ExpectedConditions.elementToBeClickable(By.id("report-type")));
		categoryDropdown.click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER);   

		driver.findElement(By.xpath("//*[@id='user']")).click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER); 
		 //*[@id='start-date']
		   driver.findElement(By.xpath(" //*[@id='start-date']")).sendKeys("20-9-2025");
		   driver.findElement(By.xpath(" //*[@id='end-date']")).sendKeys("20-10-2025");
		 //*[text()='Generate Report']
		 //*[@id='excel']
		   driver.findElement(By.xpath(" //*[@id='excel']")).click();
		   driver.findElement(By.xpath(" //*[text()='Generate Report']")).click();
}
	@Test
	void reports4()
	{
		WebDriverManager.chromedriver().setup();
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
		    By.xpath("//span[text()='Analytics & Reports']")));
		driver.findElement(By.xpath("//span[text()='Analytics & Reports']")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement categoryDropdown = wait2.until(ExpectedConditions.elementToBeClickable(By.id("report-type")));
		categoryDropdown.click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER);   

		driver.findElement(By.xpath("//*[@id='user']")).click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER); 
		 //*[@id='start-date']
		   driver.findElement(By.xpath(" //*[@id='start-date']")).sendKeys("20-9-2025");
		   driver.findElement(By.xpath(" //*[@id='end-date']")).sendKeys("20-10-2025");
		 //*[text()='Generate Report']
		 //*[@id='excel']
		   driver.findElement(By.xpath(" //*[@id='csv']")).click();
		   driver.findElement(By.xpath(" //*[text()='Generate Report']")).click();
}
	@Test
	void reports5()
	{
		WebDriverManager.chromedriver().setup();
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
		    By.xpath("//span[text()='Analytics & Reports']")));
		driver.findElement(By.xpath("//span[text()='Analytics & Reports']")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement categoryDropdown = wait2.until(ExpectedConditions.elementToBeClickable(By.id("report-type")));
		categoryDropdown.click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER);   

		driver.findElement(By.xpath("//*[@id='user']")).click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER); 
		 //*[@id='start-date']
		   driver.findElement(By.xpath(" //*[@id='start-date']")).sendKeys("20-9-2025");
		   driver.findElement(By.xpath(" //*[@id='end-date']")).sendKeys("20-10-2025");
		 //*[text()='Generate Report']
		 //*[@id='excel']
		   driver.findElement(By.xpath(" //*[@id='csv']")).click();
		   driver.findElement(By.xpath(" //*[text()='Generate Report']")).click();
}
	@Test
	void reports6()
	{
		WebDriverManager.chromedriver().setup();
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
		    By.xpath("//span[text()='Analytics & Reports']")));
		driver.findElement(By.xpath("//span[text()='Analytics & Reports']")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement categoryDropdown = wait2.until(ExpectedConditions.elementToBeClickable(By.id("report-type")));
		categoryDropdown.click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER);   

		driver.findElement(By.xpath("//*[@id='user']")).click();
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER); 
		 //*[@id='start-date']
		   driver.findElement(By.xpath(" //*[@id='start-date']")).sendKeys("20-9-2025");
		   driver.findElement(By.xpath(" //*[@id='end-date']")).sendKeys("20-10-2025");
		 //*[text()='Generate Report']
		 //*[@id='excel']
		   driver.findElement(By.xpath(" //*[@id='csv']")).click();
		   driver.findElement(By.xpath(" //*[text()='Generate Report']")).click();
}
	
}
