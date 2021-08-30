package Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import com.Personalisation.POM.BasePage;


public class LoginPage extends BasePage{

	WebDriver driver;
	
public LoginPage()  {}
	
	public  LoginPage( WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	
	//----------------- Start Xpath(Locators) ---------------------------
	
	// Login page mobile Number Text Field Xpath
	By mobileNumberTextField=By.xpath("//div[@class='IiD88i _351hSN']//input[contains(@class,'VJZDxU')]");
	
	// Login page mobile Number Text Field Xpath
	By PasswordTextField=By.xpath("(//div[@class='IiD88i _351hSN']//input[contains(@class,'VJZDxU')])[2]");
	
	
	//Login page logIn Button xpath
	By logInButton=By.xpath("(//button[@type='submit'])[2]");

	
	
	//----------------- End Xpath(Locators) ---------------------------
	
	
	
	// Method to log In to FlipKart 
	@Test(groups = {"Sanity"}, priority=0 ,enabled=true)
	public void logIntoFlipKart() throws Exception{
		
			Thread.sleep(5000);
			//Enter Mobile number
			WebElement mobileNumberTextField_webElement=(new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(mobileNumberTextField));
			mobileNumberTextField_webElement.sendKeys("9880064470");
			
			//Enter Password
			WebElement PasswordTextField_webElement=(new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(PasswordTextField));
			PasswordTextField_webElement.sendKeys("allusallurt");
			
			Thread.sleep(3000);
			//Click on login button
			WebElement logInButton_webElement=(new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(logInButton));
			logInButton_webElement.click();			
			
		
	}

	
	
}
