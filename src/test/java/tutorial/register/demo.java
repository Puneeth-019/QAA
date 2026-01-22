package tutorial.register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	@Test
void demo() {
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
	    By.xpath("//span[text()='Documents']")));
	driver.findElement(By.xpath("//span[text()='Documents']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("(//*[text()='demo.xlsx']//following::button[1])[2]")));
		driver.findElement(By.xpath("(//*[text()='demo.xlsx']//following::button[1])[2]")).click();

	WebElement ele = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//*[text()='The document \"demo.xlsx\" has been downloaded.']")
		    )
		);

	Assert.assertEquals(ele.getText(),"The document \"demo.xlsx\" has been downloaded.", "not downloaded");
	
}}
