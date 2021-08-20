package com.Personalisation.POM;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class HomePage_PO {
	
	WebDriver driver;
	Robot robot;
	Screen screen;
	
	
	public HomePage_PO() {}
	
	public  HomePage_PO( WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	
	//----------------- Start Xpath ---------------------------
	
	By fashionMenu=By.xpath("(//header[@id='header']//a[text()='Fashion'])[1]");
	By topwearLink=By.xpath("(//div[@class='menu-center']//descendant::a[@href='/fashion/clothing/topwear'])[1]");
	By Product1=By.xpath("//div[@class='shop-product-list']//descendant::img");
	By addToCartPLP=By.xpath("//button[@class='btn quick-view-button']//child::span[text()='Add to Cart']");
	By YesLetsGoPopUp=By.xpath("//button[text()='Yes, let’s go!']");
	By size=By.xpath("//div[@class='mr-auto']//descendant::span[.='44']");
	By addToCartButton=By.xpath("//div[@id='cart-buttons']//descendant::button[text()='Add to Cart']");
	By RFYProducts=By.xpath("//div[contains(@data-bxrfid,'PDP-Personalized-RecommendedForYou')]");
	By dommy=By.xpath("//div[contains(@data-bxrfid,'PDP-Standard-FeaturedProducts')]");
	
	
	
	// --------------- End Xpath----------------------
	
	public boolean selectAProdusctFromRFYWidget() {
		try {
			WebElement element=(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(dommy));
			  Thread.sleep(5000); 
			  if(element!=null) {
				  System.out.println("Element is present"+element);
			  }

			 //WebElement element = driver.findElement(addToCartButton);

			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
			  Thread.sleep(3000);
			
			return true;
		}catch (Exception e) {
		return false;
		}
		
	}
	
	public boolean refreshThePage() {
		
		
		try {
			
			
			  
			  driver.navigate().refresh();
			  Thread.sleep(10000);
			  
			 
			return true;
		}catch (Exception e) {
			return false;
					}
	}
	
	public boolean mousehOverAProductandClickOnATC() {
		try {
			Thread.sleep(3000);
			 WebElement productWebelement=(new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(Product1));
			 Actions action=new Actions(driver);
			 action.moveToElement(productWebelement).build().perform();
	
			 
			 //Thread.sleep(2000); 
			 WebElement addToCartPLPWebelement=(new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(addToCartPLP));

			  if(addToCartPLPWebelement!=null) {
				  System.out.println("Element is present"+addToCartPLPWebelement);
			  }

			  //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addToCartPLPWebelement);
			  Thread.sleep(3000);
			  addToCartPLPWebelement.click();
			
			return true;
			
		}catch(Exception ex){
			return false;
		}
		
	}
	
public boolean ClickOnClearIcon() {
		
		
		try {
			
			
			  Thread.sleep(2000);
			  screen = new Screen();
			  Pattern ClearIconImage = new Pattern("D:\\Screenshot\\ClearIcon.png");
			  screen.click(ClearIconImage); 
				 
			 
			return true;
		}catch (Exception e) {
			return false;
					}
	}

public boolean selectSizeAndClickOnATCinPLP() {
	
	try {	
			
			Thread.sleep(2000);
			  screen = new Screen();
			  /*Pattern sizePLPImage = new Pattern("D:\\Screenshot\\sizePLP.png");
			  screen.click(sizePLPImage); 
*/
			  
			  Pattern sizeSmallImage = new Pattern("D:\\Screenshot\\sizeSmall.png");

			  screen.click(sizeSmallImage); 
			  
				Thread.sleep(1000);

			  Pattern ATC_PLPImage = new Pattern("D:\\Screenshot\\ATC_PLP.png");
			  screen.click(ATC_PLPImage); 

		 
		return true;
	}catch(Exception ex) {
		return false;
	}
	}

	public void screenShot() throws IOException, InterruptedException {
    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
    File dest = new File("D://SeleniumScreenshots/" + filename);
    FileUtils.copyFile(scr, dest);
}
	//--------------------------------------------
	
	
	public boolean clickOnFashionMenu() {
		try {
			
			WebElement YesLetsGoPopUpWeb=(new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(YesLetsGoPopUp));
			YesLetsGoPopUpWeb.click();
			 
			 WebElement fashionWebelement=(new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(fashionMenu));
			 Actions action=new Actions(driver);
			 action.moveToElement(fashionWebelement).build().perform();
			return true;
			
		}catch(Exception ex){
			return false;
		}
		
	}
	
	public boolean selectTopwearLink() {
		try {
			Thread.sleep(3000);
			 WebElement topwearWebelement=(new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(topwearLink));
			 topwearWebelement.click();
			
			return true;
			
		}catch(Exception ex){
			return false;
		}
		
	}
	
	public boolean selectAProduct() {
		try {
			Thread.sleep(3000);
			 WebElement productWebelement=(new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(Product1));
			 productWebelement.click();
			
			return true;
			
		}catch(Exception ex){
			return false;
		}
		
	}
	
	//POM: Enter transaction Text Into the Filter Text Box 
			public boolean enteraTextIntoFilterTextBox() {
				try {
					  Thread.sleep(2000);

					  robot.keyPress(KeyEvent.VK_T);	
					  robot.keyPress(KeyEvent.VK_R);
					  robot.keyPress(KeyEvent.VK_A);
					  robot.keyPress(KeyEvent.VK_N);
					  robot.keyPress(KeyEvent.VK_S);


					  Thread.sleep(2000);
					  
					  robot.keyRelease(KeyEvent.VK_T);	
					  robot.keyRelease(KeyEvent.VK_R);
					  robot.keyRelease(KeyEvent.VK_A);
					  robot.keyRelease(KeyEvent.VK_N);
					  robot.keyRelease(KeyEvent.VK_S);
					  
					   

					  
					  
					  return true;
				}catch (Exception e) {	
					return false;
							}
			}
			
			
			
			public boolean clickOnAProductInPDP() {
								
				try {	
						
					WebElement element=(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(RFYProducts));
					  Thread.sleep(5000); 
					  if(element!=null) {
						  System.out.println("Element is present"+element);
					  }

					  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
					  Thread.sleep(3000);
					  element.click();

					 
					return true;
				}catch(Exception ex) {
					return false;
				}
				}
			
			public boolean selectSizeAndClickOnATC() {
				
				try {	
						
					WebElement sizeElement=(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(size));
					  Thread.sleep(3000); 
					  if(sizeElement!=null) {
						  System.out.println("Element is present"+sizeElement);
					  }

					  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", sizeElement);
					  Thread.sleep(3000);
					  sizeElement.click();
					  
					  WebElement aTCElement=(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(addToCartButton));
					  Thread.sleep(3000); 
					  if(sizeElement!=null) {
						  System.out.println("Element is present"+aTCElement);
					  }

					  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", aTCElement);
					  Thread.sleep(3000);
					  aTCElement.click();

					 
					return true;
				}catch(Exception ex) {
					return false;
				}
				}
			
			
			
				
			public boolean selectTransactionCall() {
				try {
					  screen = new Screen();
					  Thread.sleep(10000);
					  Pattern transactionCallImage = new Pattern("D:\\Screenshot\\transactionCall.png");
					  screen.click(transactionCallImage); 			
					  return true;
				}catch (Exception ex) {	
					return false;
							}
			
		}
	
			
			public boolean selectHeaderTab() {
				try {
					  screen = new Screen();
					  Thread.sleep(5000);
					  Pattern HeadersTabImage = new Pattern("D:\\Screenshot\\HeaderTababc.png");
					  Thread.sleep(5000);
					  screen.click(HeadersTabImage); 			
					  return true;
				}catch (Exception ex) {	
					return false;
							}
			
		}
			
			public boolean ScrollDownTheWindow() {
				try {
					int i=0;
					  screen = new Screen();
					  Thread.sleep(1000);
					  while(i<20) {
					  Pattern scrollDownArrowImage = new Pattern("D:\\Screenshot\\scrollDownArrow.png");
					  screen.click(scrollDownArrowImage);
					  i++;
					  }
					  return true;
				}catch (Exception ex) {	
					return false;
							}
			
		}
			
			public boolean ScrollRightTheWindow() {
				try {
					  screen = new Screen();
					  Thread.sleep(1000);
					  Pattern scrollRightArrowImage = new Pattern("D:\\Screenshot\\scrollRightArrow.png");
					  screen.click(scrollRightArrowImage); 			
					  return true;
				}catch (Exception ex) {	
					return false;
							}
			
		}
			
			public boolean verifyTypeIsATC() {
				try {
					  screen = new Screen();
					  Thread.sleep(3000);
					  Pattern typeATCImage = new Pattern("D:\\Screenshot\\typeATC.png");
					  screen.click(typeATCImage); 			
					  return true;
				}catch (Exception ex) {	
					return false;
							}
			
		}
	
	
	
			public boolean screenShotByusingPickpick() {
				try {
					  Thread.sleep(2000);

					robot.keyPress(KeyEvent.VK_PRINTSCREEN);

					Thread.sleep(1000);
					robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
					  return true;
				}catch (Exception e) {	
					return false;
							}
			}
	
	
	//-----------------------------------------------------------------------------
	//POM: Open Dev Console Window on the Browser
	public boolean openConsoleWindow() {
		try {
			 robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_I);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_I);
			return true;
		}catch (Exception e) {
			return false;
					}
	}
	
	//POM: Select Network tab
		public boolean selectNetworkTab() {
			try {
				  screen = new Screen();
				  Thread.sleep(5000);
				  Pattern networkTabImage = new Pattern("D:\\Screenshot\\NetworkTab.png");
				  screen.click(networkTabImage); 			
				  return true;
			}catch (Exception e) {	
				return false;
						}
		
	}

       //POM: Enter .ai Text Into the Filter Text Box 
		public boolean enterTextIntoFilterTextBox() {
			try {
				  Thread.sleep(2000);

				  robot.keyPress(KeyEvent.VK_ENTER);	
				  robot.keyPress(KeyEvent.VK_PERIOD);
				  robot.keyPress(KeyEvent.VK_A);
				  robot.keyPress(KeyEvent.VK_I);

				  robot.keyRelease(KeyEvent.VK_ENTER);	
				  robot.keyRelease(KeyEvent.VK_PERIOD);
				  robot.keyRelease(KeyEvent.VK_A);
				  robot.keyRelease(KeyEvent.VK_I);

				  return true;
			}catch (Exception e) {	
				return false;
						}
		}
			
		//POM: Select the Nav Call
			public boolean clickOnNavCall() {
				try {
					 driver.navigate().refresh();
					 Thread.sleep(20000);
					  screen = new Screen();
					  Pattern navCallImage = new Pattern("D:\\Screenshot\\NavCall.png");
					  screen.click(navCallImage);
						
					  return true;
				}catch (Exception e) {	
					return false;
							}
	
			}
			
			//POM: Verify Widgets status is Success or not in the Nav Call
			public boolean verifyWidgetstatusIsSuccess() {
				try {
					 Thread.sleep(5000);
					 screen = new Screen();
					  Pattern navCallImage = new Pattern("D:\\Screenshot\\WidgetsStatus.png");
					  screen.click(navCallImage);
						 Thread.sleep(10000);


					  return true;
				}catch (Exception e) {	
					return false;
							}
	
			}
			
			//POM: Verify Widgets status is Success or not in the Nav Call
			public boolean clickonSettingButton() {
				try {
					 Thread.sleep(5000);
					 screen = new Screen();
					  Pattern tabImage = new Pattern("D:\\Screenshot\\tab1.png");
					  screen.click(tabImage);

					  return true;
				}catch (Exception e) {	
					return false;
							}
	
			}
			
			//POM: Verify Widgets status is Success or not in the Nav Call
			public boolean clickonDocktoBottom() {
				try {
					 Thread.sleep(5000);
					 screen = new Screen();
					  Pattern navCallImage = new Pattern("D:\\Screenshot\\DocktoBottom.png");
					  screen.click(navCallImage);
						 Thread.sleep(1000);
										 
					  return true;
				}catch (Exception e) {	
					return false;
							}
	
			}



}
