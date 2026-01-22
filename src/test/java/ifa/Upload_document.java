package ifa;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Upload_document{
	@Test
	public void upload() {
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
	    By.xpath("//span[contains(text(),'Documents')]")
	));
	
	driver.findElement(By.xpath("//span[contains(text(),'Documents')]")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Upload Document')]")).click();
	
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("file")));
	fileInput.sendKeys("C:\\\\Users\\\\VICTUS\\\\Downloads\\\\user_performance_This Week.pdf"); 

	
	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement categoryDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("category")));
	categoryDropdown.click();
	driver.findElement(By.xpath("//option[text()='KYC Document']")).click();
	driver.findElement(By.xpath("//span[text()='KYC Document']")).click();

	
	
	driver.findElement(By.xpath("//*[@value='Pan']")).click();
	driver.findElement(By.xpath("//*[@id='assigned-to']")).sendKeys("Venkatesh QA");
	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait1.until(ExpectedConditions.visibilityOfElementLocated(
	    By.xpath("//div[contains(text(),'Venkatesh QA')]")));
	driver.findElement(By.xpath("//div[contains(text(),'Venkatesh QA')]")).click();

	driver.findElement(By.xpath("//*[text()='Upload']")).click();
}
}