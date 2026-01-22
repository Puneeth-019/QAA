package ifa;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfaTC1 {
	
	@Test
	
	public void Login() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		
		
		//login feature
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://qa.ifaclick.com/login");
		driver.findElementById("email").sendKeys("venkatesh.prasad@techcanopy.com");
		
		driver.findElementById("password").sendKeys("Manuvenky7#");
		
		driver.findElementByXPath("//button[@type='submit']").click();
		
		
		String actualTitle = driver.getTitle().trim();
		
		System.out.println(actualTitle);
		
		
		Thread.sleep(2000);

		
		Actions act=new Actions(driver);
		
		act.contextClick(driver.findElementByXPath("//div[text()='Prospect mark']")).perform();
		
		
	}

}
