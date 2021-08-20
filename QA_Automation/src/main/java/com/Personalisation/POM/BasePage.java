package com.Personalisation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BasePage {
	


    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    public WebDriver driver;
    private WebDriverWait wait;
    public ExtentTest logger;
    public ExtentReports extent;
    
    public BasePage() {}

   
    
    public BasePage(WebDriver driver) {
    	 this.driver = driver;	
    	 wait = new WebDriverWait(driver, TIMEOUT, POLLING);
    	 
    }
    
    
    
    @BeforeClass
    
    public void extentReports() {
    	
    	//. represent current working directory
    	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./ExtentReport/report.html");
    	
    	 extent=new ExtentReports();
    	extent.attachReporter(reporter);
    	// logger=extent.createTest("Personalization test");
    }
    
    @Parameters({"url"})
    @BeforeMethod
    public void launchTheBrowser(@org.testng.annotations.Optional ("url")String url) {
		
		
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		   if(url.equalsIgnoreCase("firefox")) {
			 
		 driver = new FirefoxDriver();
				  
		}else if(url.equalsIgnoreCase("safari")) {	
			
			driver=new SafariDriver();
			
		}else if(url.equalsIgnoreCase("ie")) {
			
			driver=new InternetExplorerDriver();
		}

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get(url);
    }
    
    @AfterMethod
    public void closeTheBrowser() {
    	driver.close();
    }
    
    @AfterTest
    public void afterTest() {
    	extent.flush();
    }


    
    
    protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    
    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    
    protected void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
        
        }
    }



