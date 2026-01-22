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

public class NSEdata {
	@Test
	public void dynamicdata()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nseindia.com/market-data/live-equity-market");

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.presenceOfElementLocated(
	        By.xpath("//table[@id='equityStockTable']/tbody/tr[1]/td[1]")));

	List<WebElement> rows = driver.findElements(
	        By.xpath("//table[@id='equityStockTable']/tbody/tr"));

	for (WebElement row : rows) {
	    List<WebElement> cells = row.findElements(By.tagName("td")); 
	    if (cells.size() >= 3) {  
	        String symbol = row.findElement(By.xpath("./td[1]")).getText().trim();
	        String high   = row.findElement(By.xpath("./td[3]")).getText().trim();
	        System.out.println(symbol + " -> " + high);
	    }
	}

	driver.quit();

}
}
