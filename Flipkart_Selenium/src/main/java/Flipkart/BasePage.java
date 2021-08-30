package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BasePage {
	
	
	public BasePage() {}

public WebDriver driver;
    
    public BasePage(WebDriver driver) {
    	 this.driver = driver;	
    	  	 
    }
    
    
    
    @BeforeMethod
    public void launchTheBrowser() {
		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakesh\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com");
    }
    
    @AfterMethod
    public void closeTheBrowser() {
    	driver.close();
    }
    
    
    

}
