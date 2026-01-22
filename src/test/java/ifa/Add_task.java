package ifa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_task {
	@Test
	public void addtask_call() {
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
		    By.xpath("//span[contains(text(),'Tasks')]")
		));
		driver.findElement(By.xpath("//span[contains(text(),'Tasks')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//button[contains(text(),' Add Task')]")
			));
		driver.findElement(By.xpath("//button[contains(text(),' Add Task')]")).click();
		driver.findElement(By.id("task-title")).sendKeys("TEST call");
		WebElement priority  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Priority ']/following::button[1]")));
	priority.click();   

		driver.switchTo().activeElement().sendKeys(Keys.ARROW_UP);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		WebElement status  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Status ']/following::button[1]")));
	status.click(); 
		
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@type='date']")).sendKeys("20-9-2026");

		driver.findElement(By.xpath("//*[@id='task-related-to']")).sendKeys("Venkatesh QA");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//div[contains(text(),'Venkatesh QA')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Venkatesh QA')]")).click();
		WebElement task_type  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Task Type ']/following::button[1]")));
		
		task_type.click(); 
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[text()='Add Task']")).click();
	WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//div[text()='Task created successfully']")));

	Assert.assertTrue(successMsg.isDisplayed(), "Task was not added successfully!");

}
	@Test
	public void addtask_followup() {
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
		    By.xpath("//span[contains(text(),'Tasks')]")
		));
		driver.findElement(By.xpath("//span[contains(text(),'Tasks')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//button[contains(text(),' Add Task')]")
			));
		driver.findElement(By.xpath("//button[contains(text(),' Add Task')]")).click();
		driver.findElement(By.id("task-title")).sendKeys("TEST followUP");
		WebElement priority  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Priority ']/following::button[1]")));
	priority.click();   

		
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		WebElement status  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Status ']/following::button[1]")));
	status.click(); 
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@type='date']")).sendKeys("20-9-2026");

		driver.findElement(By.xpath("//*[@id='task-related-to']")).sendKeys("Venkatesh QA");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//div[contains(text(),'Venkatesh QA')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Venkatesh QA')]")).click();
		WebElement task_type  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Task Type ']/following::button[1]")));
		
		task_type.click(); 
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[text()='Add Task']")).click();
}
	@Test
	public void addtask_reminder() {
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
		    By.xpath("//span[contains(text(),'Tasks')]")
		));
		driver.findElement(By.xpath("//span[contains(text(),'Tasks')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//button[contains(text(),' Add Task')]")
			));
		driver.findElement(By.xpath("//button[contains(text(),' Add Task')]")).click();
		driver.findElement(By.id("task-title")).sendKeys("TEST reminder");
		WebElement priority  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Priority ']/following::button[1]")));
	priority.click();   

		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		WebElement status  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Status ']/following::button[1]")));
	status.click(); 
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@type='date']")).sendKeys("20-9-2026");

		driver.findElement(By.xpath("//*[@id='task-related-to']")).sendKeys("Venkatesh QA");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//div[contains(text(),'Venkatesh QA')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Venkatesh QA')]")).click();
		WebElement task_type  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Task Type ']/following::button[1]")));
		
		task_type.click(); 
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[text()='Add Task']")).click();
}
	@Test
	public void addtask_todo() {
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
		    By.xpath("//span[contains(text(),'Tasks')]")
		));
		driver.findElement(By.xpath("//span[contains(text(),'Tasks')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//button[contains(text(),' Add Task')]")
			));
		driver.findElement(By.xpath("//button[contains(text(),' Add Task')]")).click();
		driver.findElement(By.id("task-title")).sendKeys("TEST todo");
		WebElement priority  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Priority ']/following::button[1]")));
	priority.click();   

		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		WebElement status  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Status ']/following::button[1]")));
	status.click(); 
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@type='date']")).sendKeys("20-9-2026");

		driver.findElement(By.xpath("//*[@id='task-related-to']")).sendKeys("Venkatesh QA");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//div[contains(text(),'Venkatesh QA')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Venkatesh QA')]")).click();
		WebElement task_type  = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[text()='Task Type ']/following::button[1]")));
		
		task_type.click(); 
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[text()='Add Task']")).click();
}
}