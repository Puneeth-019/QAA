package tutorial.register;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Emailautomation {
@Test
	public void email() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa.ifaclick.com/leads");

	driver.findElement(By.id("email"))
	      .sendKeys("venkatesh.prasad@techcanopy.com");
	driver.findElement(By.id("password"))
	      .sendKeys("Manuvenky7#");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.presenceOfElementLocated(
	        By.xpath("//tbody/tr")));

	List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
	System.out.println("Rows found: " + rows.size());

	for (WebElement row : rows) {
	    System.out.println(row.getText().trim());
	}

	driver.quit();


}
}
