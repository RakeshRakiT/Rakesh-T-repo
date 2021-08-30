package Flipkart;

import java.io.FileWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IPhonesSearch extends BasePage{
	
	FileWriter writer;
	
	public IPhonesSearch()  {}
		
		public  IPhonesSearch( WebDriver driver) {
			this.driver=driver;
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		}
		
		
		
		//----------------- Start Xpath(Locators) ---------------------------
		
		//  Search Text Field Xpath
		By searchTextField=By.xpath("//input[@placeholder='Search for products, brands and more']");
		
		//Search Icon Xpath
		By searchIcon=By.xpath("//button[@type=\"submit\"]");
		
		// Price -- Low to High Xpath
		By lowPriceToHigh=By.xpath("//div[text()='Price -- Low to High']");
		
		//deviceModel Xpath matching with multiple element
		By deviceModel=By.xpath("//div[@class='_4rR01T']");
		
		//Price Xpath matching with multiple element
		By prodPrice=By.xpath("//div[@class='_30jeq3 _1_WHN1']");
		
		//Ratings Xpath matching with multiple element
		By ratings=By.xpath("//div[@class='_3LWZlK']");
		
		//----------------- End Xpath(Locators) ---------------------------
			
		
		// Method to Search Iphones and Storing data into CSV file 
		@Test(groups = {"Sanity"})
		public void searchIphone() throws Exception
		{
			writer = new FileWriter ("C:\\Users\\rakesh\\Desktop\\SeleniumResult\\result.csv");

			// Calling Login Method
			LoginPage login=new LoginPage(driver);
			Thread.sleep(2000);
			login.logIntoFlipKart();
			
			
				Thread.sleep(2000);
				//Search for IPhones
				WebElement searchTextField_webElement=(new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(searchTextField));
				searchTextField_webElement.sendKeys("iPhones");
				
				//Click on Search Icon
				WebElement searchIcon_webElement=(new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(searchIcon));
				searchIcon_webElement.click();				
						
				//Sort/Click on low Price To High Price in Home page
				WebElement lowPriceToHigh_webElement=(new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(lowPriceToHigh));
				lowPriceToHigh_webElement.click();	
				
				Thread.sleep(10000);
				// Getting Multiple webelements in order to retrieve  Device Model from DOM
				List<WebElement> deviceModel_webElements = driver.findElements(deviceModel);
				
				// Getting Multiple webelements in order to retrieve  products Price from DOM
				List<WebElement> prodPrice_webElements = driver.findElements(prodPrice);
				
				//Getting Multiple webelements in order to retrieve  products Rating
				List<WebElement> ratings_webElements = driver.findElements(ratings);

				//Lood for retrieve value of Device Model/Price and Rating.
				for (int i=0; i<deviceModel_webElements.size();i++)
				{
					String productPrice=prodPrice_webElements.get(i).getText();
						
					String price=charRemoveAt(productPrice,0);
					String price1=charRemoveAt(price,2);
					
					int prodPrice=Integer.parseInt(price1); 			
					
					if(prodPrice<=40000)
					{
					String result=deviceModel_webElements.get(i).getText()+", "+ productPrice +", Rating "+ratings_webElements.get(i).getText();
					System.out.println(result);
			      
					writer.write(result); 
					writer.write("\n");
			
			        
					}
					
				}
				writer.close();
				    			
		}

		public static String charRemoveAt(String str, int p) {
			return str.substring(0, p) + str.substring(p + 1);
			}
		
		

}
