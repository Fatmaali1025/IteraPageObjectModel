package pages.test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SignUpPage extends BaseTest {

	@Test
	public void VerifySignUpBtn() {
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click(); 
		String expectedtitle = "Add new user";
		String actualtitle =driver.findElement(By.xpath("//h2[normalize-space()='Add new user']")).getText();
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("The Title of the SignUp form is Equal to the expected title -->" +actualtitle);
		}
		else {
			System.out.println("The Title of the SignUp form is not Equal to the expected title --> "  +  actualtitle);

		}

	}

	@Test
	public void signUpWithValidInfo() {

		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Amira");
		driver.findElement(By.xpath("//input[@id='Surname']")).sendKeys("Ali");
		driver.findElement(By.xpath("//input[@id='E_post']")).sendKeys("fatmaali1025@yahoo.com");
		driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("133-456-3654");
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("Adam20");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ali100");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Ali100");
		driver.findElement(By.xpath("//input[@id='submit']")).click();

		String expectedtext = "Registration Successful";
		String actualtext = driver.findElement(By.xpath("//label[normalize-space()='Registration Successful']")).getText();
		System.out.println("expectedtext -> " + expectedtext + " actualtext -> " + actualtext);
		if(actualtext.equals(expectedtext)) {
			System.out.println("The validation of the registration form is:  " +actualtext);
		}
		else {
			System.out.println("The expected text validation for registration form is not equal to  :   "  +  actualtext);

		}
		Assert.assertEquals(actualtext, expectedtext);
	}
}




