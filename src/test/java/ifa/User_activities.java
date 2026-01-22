package ifa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class User_activities {
	@Test
	void filter() throws InterruptedException {

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
	    By.xpath("//span[text()='User Activities']")
	));
	driver.findElement(By.xpath("//span[text()='User Activities']")).click();
	driver.findElement(By.xpath("//*[@type='date']")).sendKeys("15-01-2025");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@type='date']")).sendKeys("15-12-2025");
}
}