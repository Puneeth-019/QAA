package tutorial.register;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_001 {
@Test
public void register() throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();
driver.get("https://tutorialsninja.com/demo/");
driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.id("input-firstname")).sendKeys("dolu");
driver.findElement(By.id("input-lastname")).sendKeys("bolu");
driver.findElement(By.id("input-email")).sendKeys(newgmail());
driver.findElement(By.id("input-telephone")).sendKeys("9990009990");
driver.findElement(By.id("input-password")).sendKeys("chotabheem");
driver.findElement(By.id("input-confirm")).sendKeys("chotabheem");
driver.findElement(By.xpath("//input[@type='radio' and @name='newsletter']")).click();
driver.findElement(By.xpath("//input[@type='checkbox' and @name='agree']")).click();
driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']")).click();
Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());

String expectedHeading = "Your Account Has Been Created!";
String actualHeading = driver
     .findElement(By.xpath("//div[@id='common-success']//h1"))
     .getText();
Assert.assertEquals(actualHeading, expectedHeading);
String actualProperDetailsOne   = "Congratulations! Your new account has been successfully created!";
String actualProperDetailsTwo   = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
String actualProperDetailsThree = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
String actualProperDetailsFour  = "contact us";


String expectedProperDetails = driver
     .findElement(By.id("content"))
     .getText();

Assert.assertTrue(expectedProperDetails.contains(actualProperDetailsOne));
Assert.assertTrue(expectedProperDetails.contains(actualProperDetailsTwo));
Assert.assertTrue(expectedProperDetails.contains(actualProperDetailsThree));
Assert.assertTrue(expectedProperDetails.contains(actualProperDetailsFour));
driver.findElement(By.linkText("Continue")).click();
Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
driver.quit();
}

public String newgmail()
{
	return new Date().toString().replaceAll(" ", "").replaceAll("\\:", "")+"@gmail.com";
}
}
