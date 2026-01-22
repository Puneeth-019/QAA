//package tutorial.register;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//public class Frames {
//	@Test
//	void iframe() throws InterruptedException {
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://the-internet.herokuapp.com/");
//	String mainWindow = driver.getWindowHandle();
//	 driver.findElement(By.xpath("//*[text()='Frames']")).click();
//	 Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//button[1])[7]")).click();
//		Thread.sleep(1000);
//		 driver.switchTo().frame("mce_0_ifr");
//		 Thread.sleep(1000);
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(
//			    By.xpath("//*[@data-id='mce_0']/p")));
//	        WebElement editor = driver.findElement(By.xpath("//*[@data-id='mce_0']/p"));
//	        
//	        editor.clear();
//	        editor.sendKeys("Hello Puneeth, practicing iframe automation!");
//	        Thread.sleep(2000);
//	        driver.switchTo().defaultContent();
//
//	        driver.quit();
//
//	}  
//}
package tutorial.register;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Frames {
    @Test
    public void iframe() {
        WebDriver driver = new ChromeDriver();
        
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
            driver.findElement(By.xpath("//*[text()='Frames']")).click();
            driver.findElement(By.xpath("//a[text()='iFrame']")).click();

            driver.switchTo().frame("mce_0_ifr");

            WebElement body = driver.findElement(By.cssSelector("body#tinymce"));
            String text = "Hello Puneeth, practicing iframe automation!";
            ((JavascriptExecutor) driver).executeScript("arguments[0].innerHTML = arguments[1];", body, text);

            driver.switchTo().defaultContent();
           driver.quit();
        
    }
}