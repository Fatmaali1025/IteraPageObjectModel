package pages.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAutomationPageTest extends BaseTest {

	@Test(priority=1)
	public void VerifyTestAutomationButton() {

		driver.findElement(By.xpath("//a[normalize-space()='Test Automation']")).click();
		String expectedtext ="Test automation practice form";
		String actualtext = driver.findElement(By.xpath("//h1[normalize-space()='Test automation practice form']")).getText();
		
		if(actualtext.equals(expectedtext)) {  
			System.out.println("actual text equals to the expected text: " + actualtext);

		}
		else {
			System.out.println("actual text is not equal the expected text: " + actualtext);
			System.out.println("TEST FAILED");

		}
		Assert.assertEquals(actualtext, expectedtext);
	}

	@Test(priority=2)

	public void TestAutomationPracticeForm() {

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aya");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123-123-1236");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aya10@yahoo.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Aya10");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("10 Main st");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		driver.findElement(By.xpath("//input[@id='female']")).click();
		driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		driver.findElement(By.xpath("//input[@id='friday']")).click();

		Select select = new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));
		select.selectByVisibleText("Finland");
		
//		WebElement dropdown = driver.findElement(By.className("custom-select"));
//	    Select select = new Select(dropdown);
//	    select.selectByVisibleText("Norway");
//	    
	    
		driver.findElement(By.xpath("//label[normalize-space()='1 year']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Selenium Webdriver']")).click();
		
		driver.findElement(By.xpath("//label[normalize-space()='TestNG']")).click();
		//		driver.findElement(By.xpath("//input[@id='inputGroupFile02']")).click();
		driver.findElement(By.xpath("//span[@class='input-group-text']")).click();
	}

}
