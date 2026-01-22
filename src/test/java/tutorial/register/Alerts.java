package tutorial.register;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.gson.annotations.Until;

public class Alerts {
	@Test
	  public void popup1() {
	        WebDriver driver = new ChromeDriver();
	        
	            driver.manage().window().maximize();
	            driver.get("https://testpages.herokuapp.com/pages/basics/alerts-javascript/");

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       
	            driver.findElement(By.xpath("//button[text()='Show alert box']")).click();
	            Alert alert = driver.switchTo().alert();
	            String text = alert.getText();
	            alert.accept(); // or alert.dismiss(); or alert.sendKeys("input");
	        
	    }
	@Test
	  public void popup2() throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        
	            driver.manage().window().maximize();
	            driver.get("https://testpages.herokuapp.com/pages/basics/alerts-javascript/");

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(
	            	    By.cssSelector("#confirmexample")));
	            driver.findElement(By.cssSelector("#confirmexample")).click();
	            Alert alert = driver.switchTo().alert();
	            String text = alert.getText();
	            alert.dismiss(); 
	        
	    }
	  public void popup3() {
	        WebDriver driver = new ChromeDriver();
	        
	            driver.manage().window().maximize();
	            driver.get("https://testpages.herokuapp.com/pages/basics/alerts-javascript/");

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       
	            driver.findElement(By.xpath("//button[text()='Show alert box']")).click();
	            Alert alert = driver.switchTo().alert();
	            String text = alert.getText();
	            alert.accept(); // or alert.dismiss(); or alert.sendKeys("input");
	        
	    }
}
