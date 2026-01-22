package ifa;

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

public class TC1_riskassesment {
	@Test
	
	public void TC1(){

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://qa.ifaclick.com/leads");

		driver.findElement(By.id("email")).sendKeys("venkatesh.prasad@techcanopy.com");
		driver.findElement(By.id("password")).sendKeys("Manuvenky7#");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement leadcount = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//*[text()='Cold Leads']//following::div[2]/div")
		    )
		);

		Assert.assertEquals(leadcount.getText(),"11", "wrong count!");
		driver.findElement(By.xpath("//*[text()='Cold Leads']//following::div[2]/div")).click();
}
}
