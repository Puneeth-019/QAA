package tutorial.register;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_windows {
	@Test
    public void openNSE() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		String mainWindow = driver.getWindowHandle();
		 driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		 Thread.sleep(1000);
	
			driver.findElement(By.xpath("//a[text()='Click Here']")).click();
			Thread.sleep(1000);
	        
	        Set<String> allWindows = driver.getWindowHandles();

	        for (String window : allWindows) {
	            if (!window.equals(mainWindow)) {
	                driver.switchTo().window(window);
	                System.out.println("Child window title: " + driver.getTitle());

	                Thread.sleep(1000);
	                 String data = driver.findElement(By.xpath("//div/h3")).getText();
	                 System.out.println("the text is:"+data);

	                driver.close();
	            }
	        }

	        driver.switchTo().window(mainWindow);
	        System.out.println("Back to main window: " + driver.getTitle());
        driver.close();
	    }




}

