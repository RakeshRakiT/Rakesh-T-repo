package com.Personalisation.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.Personalisation.POM.BasePage;
import com.Personalisation.POM.HomePage_PO;
import com.aventstack.extentreports.Status;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class HomePage_TC extends BasePage {
	
   //public static WebDriver driver;

	public HomePage_TC( ) {}	
	
	
	@Test(groups = {"Sanity"}, priority=1 ,enabled=true, invocationCount=1)
	public  void verifyMissingTagsInXML() throws AWTException, InterruptedException, FindFailed, IOException {
		
		
		System.out.println(driver.getPageSource());
		driver.
			
			Thread.sleep(1000000);
//				/*WebElement element=(new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(YesLetsGoPopUp));
//				String text=element.getText();
//				if(text.contains("link")) {
//
//				 
//					
//							  Thread.sleep(2000);
//
//							robot.keyPress(KeyEvent.VK_PRINTSCREEN);
//
//							Thread.sleep(1000);
//							robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
//							  
//						
//			}
//		
//				*/

				
	
	
	}
	
	@Test(groups = {"Sanity","HomePage"}, priority=1 ,enabled=true, invocationCount=1)
	public  void verifyATCOnTransactionCallInPLP() throws AWTException, InterruptedException, FindFailed, IOException {
		
		
		//-----------------------------------------------------------------
		HomePage_PO networkTab=new HomePage_PO(driver);
		
		Thread.sleep(100000000);
		   
		   logger=extent.createTest("TC-1: Verify ATC in Transaction call in PLP");
		     
		  		   
		// click On Fashion Menu
		   Assert.assertTrue(networkTab.clickOnFashionMenu(),"Oops! not able to click On Fashion Menu.");
		   logger.log(Status.PASS, "click On Fashion Menu");

		    // Select TopWear link
		   Assert.assertTrue(networkTab.selectTopwearLink(),"Oops! not able to Select TopWear link.");
		   logger.log(Status.PASS, "Select TopWear link");
		   
		// Open Dev Console Window on the Browser
		   Assert.assertTrue(networkTab.openConsoleWindow(),"Oops! not able to Open Dev Console Window on the Browser");
		   logger.log(Status.PASS, "Open Dev Console Window on the Browser");

		   
		   //Select Network tab
		   Assert.assertTrue(networkTab.selectNetworkTab(),"Oops! not able to Select Network tab.");
		   logger.log(Status.PASS, "Select Network tab");
		   
		  //Enter trans Text Into the Filter Text Box 
		   Assert.assertTrue(networkTab.enteraTextIntoFilterTextBox(),"Oops! not able to Enter trans Text Into the Filter Text Box.");
		   logger.log(Status.PASS, "Enter trans Text Into the Filter Text Box");
		   
		  Assert.assertTrue(networkTab.refreshThePage(),"Oops! not able to select Size And Click On ATC");

		   
		  
		   Assert.assertTrue(networkTab.mousehOverAProductandClickOnATC(),"Oops! not able to Click on a product on PLP.");
		   logger.log(Status.PASS, "Click on a product on PLP");
		   
		  Thread.sleep(5000);
		   
		   Assert.assertTrue(networkTab.ClickOnClearIcon(),"Oops! not able to select Size And Click On ATC");

		   Assert.assertTrue(networkTab.selectSizeAndClickOnATCinPLP(),"Oops! not able to select Size And Click On ATC");
		   
		   Assert.assertTrue(networkTab.selectTransactionCall(),"Oops! not able to select Size And Click On ATC");

			  // Assert.assertTrue(networkTab.selectSizeAndClickOnATC(),"Oops! not able to select Size And Click On ATC");

			   Assert.assertTrue(networkTab.selectHeaderTab(),"Oops! not able to select Size And Click On ATC");

			   Assert.assertTrue(networkTab.ScrollDownTheWindow(),"Oops! not able to select Size And Click On ATC");

			   Assert.assertTrue(networkTab.ScrollRightTheWindow(),"Oops! not able to select Size And Click On ATC");
			   
			   Assert.assertTrue(networkTab.verifyTypeIsATC(),"Oops! not able to select Size And Click On ATC");
			   
			   Assert.assertTrue(networkTab.screenShotByusingPickpick(),"Oops! not able to select Size And Click On ATC");

			   networkTab.screenShot();
		   }



	
	@Test(groups = {"Sanity","HomePage"}, priority=1 ,enabled=false , invocationCount=50)
	public  void verifyATCOnTransactionCallInPDP() throws AWTException, InterruptedException, FindFailed, IOException {
	   
	   
	   HomePage_PO networkTab=new HomePage_PO(driver);
	   
	   logger=extent.createTest("TC-1: Verify ATC in Transaction call");
	   
	   
	   
	   // click On Fashion Menu
	   Assert.assertTrue(networkTab.clickOnFashionMenu(),"Oops! not able to click On Fashion Menu.");
	   logger.log(Status.PASS, "click On Fashion Menu");

	    // Select TopWear link
	   Assert.assertTrue(networkTab.selectTopwearLink(),"Oops! not able to Select TopWear link.");
	   logger.log(Status.PASS, "Select TopWear link");
	   
	   // Click on a product on PLP
	   Assert.assertTrue(networkTab.selectAProduct(),"Oops! not able to Click on a product on PLP.");
	   logger.log(Status.PASS, "Click on a product on PLP");

	   
	   Assert.assertTrue(networkTab.clickOnAProductInPDP(),"!Oops!not able to click on ATC");
	   logger.log(Status.PASS, "click on ATC");
	   
	 

	   // Open Dev Console Window on the Browser
	   Assert.assertTrue(networkTab.openConsoleWindow(),"Oops! not able to Open Dev Console Window on the Browser");
	   logger.log(Status.PASS, "Open Dev Console Window on the Browser");

	   
	   //Select Network tab
	   Assert.assertTrue(networkTab.selectNetworkTab(),"Oops! not able to Select Network tab.");
	   logger.log(Status.PASS, "Select Network tab");
	   
	 //Enter trans Text Into the Filter Text Box 
	   Assert.assertTrue(networkTab.enteraTextIntoFilterTextBox(),"Oops! not able to Enter trans Text Into the Filter Text Box.");
	   logger.log(Status.PASS, "Enter trans Text Into the Filter Text Box");
	   
		  Assert.assertTrue(networkTab.refreshThePage(),"Oops! not able to select Size And Click On ATC");
		  
		   Assert.assertTrue(networkTab.ClickOnClearIcon(),"Oops! not able to select Size And Click On ATC");

	   
	 //select Size And Click On ATC
	   Assert.assertTrue(networkTab.selectSizeAndClickOnATC(),"Oops! not able to select Size And Click On ATC");
	   logger.log(Status.PASS, "Enter trans Text Into the Filter Text Box");
	   
	   Assert.assertTrue(networkTab.selectTransactionCall(),"Oops! not able to select Size And Click On ATC");

	  // Assert.assertTrue(networkTab.selectSizeAndClickOnATC(),"Oops! not able to select Size And Click On ATC");

	   Assert.assertTrue(networkTab.selectHeaderTab(),"Oops! not able to select Size And Click On ATC");

	   Assert.assertTrue(networkTab.ScrollDownTheWindow(),"Oops! not able to select Size And Click On ATC");

	   Assert.assertTrue(networkTab.ScrollRightTheWindow(),"Oops! not able to select Size And Click On ATC");
	   
	   Assert.assertTrue(networkTab.verifyTypeIsATC(),"Oops! not able to select Size And Click On ATC");

	   Assert.assertTrue(networkTab.screenShotByusingPickpick(),"Oops! not able to select Size And Click On ATC");

	   networkTab.screenShot();
	   
	}
	
	   @Test(groups = {"Sanity","HomePage"}, priority=1 ,enabled=false)
		public  void verifyNavCallInHomePage() throws AWTException, InterruptedException, FindFailed {
		   
		   
		   HomePage_PO networkTab=new HomePage_PO(driver);
		   
		   logger=extent.createTest("TC-1: Verify the Widgets status is Success with status code 200");
		   
		   // Open Dev Console Window on the Browser
		   Assert.assertTrue(networkTab.openConsoleWindow(),"Oops! not able to Open Dev Console Window on the Browser");
		   logger.log(Status.PASS, "Open Dev Console Window on the Browser");

		   
		   //Select Network tab
		   Assert.assertTrue(networkTab.selectNetworkTab(),"Oops! not able to Select Network tab.");
		   logger.log(Status.PASS, "Select Network tab");

		   
		   //Enter .ai Text Into the Filter Text Box 
		   Assert.assertTrue(networkTab.enterTextIntoFilterTextBox(),"Oops! not able to Enter .ai Text Into the Filter Text Box.");
		   logger.log(Status.PASS, "Enter .ai Text Into the Filter Text Box");

		   
		   //Refresh the page and Select the Nav Call
		   Assert.assertTrue(networkTab.clickOnNavCall(),"Oops! not able to Select the Nav Call.");
		   logger.log(Status.PASS, "Refresh the page and Select the Nav Call.");

		   
		  // Verify Widgets status is Success or not in the Nav Call
		   Assert.assertTrue(networkTab.verifyWidgetstatusIsSuccess(),"Widgets status is Returning Nothing");
		   logger.log(Status.PASS, "Widgets status is Success with status code 200");

		 
		}

	   @Test(groups = {"Sanity","HomePage"}, priority=0, enabled=false )
		public  void verifyNavCallInHomePage123() throws AWTException, InterruptedException, FindFailed {
		   
		   
		   HomePage_PO networkTab=new HomePage_PO(driver);
		   
		   logger=extent.createTest("TC-1: Verify the Widgets status is Success with status code 200");
		   
		   // Open Dev Console Window on the Browser
		   Assert.assertTrue(networkTab.openConsoleWindow(),"Oops! not able to Open Dev Console Window on the Browser");
		   logger.log(Status.PASS, "Open Dev Console Window on the Browser");

		   
		   //Select Network tab
		   Assert.assertTrue(networkTab.selectNetworkTab(),"Oops! not able to Select Network tab.");
		   logger.log(Status.PASS, "Select Network tab");

		   
		   //Enter .ai Text Into the Filter Text Box 
		   Assert.assertTrue(networkTab.enterTextIntoFilterTextBox(),"Oops! not able to Enter .ai Text Into the Filter Text Box.");
		   logger.log(Status.PASS, "Enter .ai Text Into the Filter Text Box");

		   
		   //Refresh the page and Select the Nav Call
		   Assert.assertTrue(networkTab.clickOnNavCall(),"Oops! not able to Select the Nav Call.");
		   logger.log(Status.PASS, "Refresh the page and Select the Nav Call.");

		   
		  // Verify Widgets status is Success or not in the Nav Call
		   Assert.assertTrue(networkTab.verifyWidgetstatusIsSuccess(),"Widgets status is Returning Nothing");
		   logger.log(Status.PASS, "Widgets status is Success with status code 200");
		   
		  /* Assert.assertTrue(networkTab.verifyWidgetstatusIsSuccess12(),"Widgets status is Returning Nothing");
		   logger.log(Status.PASS, "Widgets status is Success with status code 200");

		   Assert.assertTrue(networkTab.verifyWidgetstatusIsSuccess123(),"Widgets status is Returning Nothing");
		   logger.log(Status.PASS, "Widgets status is Success with status code 200");
*/

		 
		}
	   
	   public void simplyaTesting() {
		   
		   HomePage_PO networkTab=new HomePage_PO(driver);
		   
		   
		   Assert.assertEquals(networkTab.clickOnFashionMenu(), true,"Oops! not able to clcik on elemrnt on the browers.");
		   
		   Assert.assertEquals(networkTab.ClickOnClearIcon(), true,"Oops! not able to click on clear Icon ");
		   
		   Assert.assertEquals(networkTab.enterTextIntoFilterTextBox(), true,"!) !O0ops not able to enter text to filter.");
		   
		   Assert.assertEquals(networkTab.ScrollRightTheWindow(), true,"!oops not able to scroll right in the desktop.");
		   
		   Assert.assertEquals(networkTab.mousehOverAProductandClickOnATC(), true,"!oops not ale to mouse over the products and click on ATC");
		   
		   Assert.assertEquals(networkTab.ClickOnClearIcon(), true,"!Oops not able to click on clear Icon");
		   
		   Assert.assertEquals(networkTab.selectAProdusctFromRFYWidget(), true,"!Oops not bale to select A products from RFT widget");
		   
		   Assert.assertEquals(networkTab.clickonDocktoBottom(), true,"!Oops not able to clcik on click on Dock to bottom.");
		   
		   Assert.assertEquals(networkTab.enteraTextIntoFilterTextBox(), true,"!Oops not able t enter text into filter icon");
		   
		   
	   }


}
