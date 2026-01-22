package ifa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Lead_schedule {
	@Test
void schedule()
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
		    By.xpath("//div[text()='krishna']")));
	driver.findElement(By.xpath("//div[text()='krishna']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//button[text()='Schedule']")));
	driver.findElement(By.xpath("//button[text()='Schedule']")).click();
	driver.findElement(By.xpath("//*[text()='Offline Meeting']/parent::span/button")).click();
	
	driver.findElement(By.xpath("//*[@placeholder='Meeting Info']")).sendKeys("profile information verification");
	
	WebElement dateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='date']")));
driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20-01-2026");
	
	WebElement timeField = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//*[text()='Select time']")));
	timeField.click();

	WebElement hour = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//*[text()='Hour' ]/following::div[1]/button[8]")));
	hour.click();

	WebElement minute = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//*[text()='Minute' ]/following::div[1]/button[7]")));
	minute.click();

	WebElement period = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//*[text()='Period' ]/following::div[1]/button[1]")));
	period.click();

	WebElement setTimeBtn = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//button[text()='Set Time' ]")));
	setTimeBtn.click();
	System.out.println("new changes");

	System.out.println("finished");
driver.close();
}
}
