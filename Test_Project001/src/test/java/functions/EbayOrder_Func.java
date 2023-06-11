package functions;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pages.EbayOrderPage;
 

public class EbayOrder_Func {

	public static WebDriver driver;


	public EbayOrder_Func(WebDriver driver) {

		this.driver = driver;
	}

	public static void setUp() {

		System.setProperty("webdriver.chrome.driver", "D://softwares//browserDrivers//chromedriver.exe");

		driver = new ChromeDriver();

		// Go to google.com
		driver.get("https://www.google.com/");

	}

	public void searchText(String text) {
 

		EbayOrderPage ebayOrderPg = new EbayOrderPage(driver);

		// Maximized browser
		driver.manage().window().maximize();

		// Enter text to the search box
		ebayOrderPg.searchTextBox(driver).sendKeys(text);

		// Click on next button
		ebayOrderPg.searchButton(driver).sendKeys(Keys.RETURN);

	}
	
	public void eBayUrl1() {
		
		EbayOrderPage ebayOrderPg = new EbayOrderPage(driver);
		//Instantiate Action Class   
		
		ebayOrderPg.eBayUrl(driver).click(); 
		
	}
	
	public void NavigateToProductScreen() {
		
		EbayOrderPage ebayOrderPg = new EbayOrderPage(driver);
		
		//Instantiate Action Class   
	 
        Actions actions = new Actions(driver);
        
        actions.moveToElement(ebayOrderPg.fashionElement(driver)).perform();
        
 
	}
	
	public void clickOnjewellary() {
		
		EbayOrderPage ebayOrderPg = new EbayOrderPage(driver);
		
		ebayOrderPg.jewellaryElement(driver).click();  
}
	
	public void searchForjewellary(String text) {
		
		EbayOrderPage ebayOrderPg = new EbayOrderPage(driver);
		
        ebayOrderPg.searchTextBox2(driver).sendKeys(text);
        
        ebayOrderPg.searchButton2(driver).click();
	}
	
	public void clickONjewellaryImage() {
		
		EbayOrderPage ebayOrderPg = new EbayOrderPage(driver); 
        
        ebayOrderPg.image(driver).click();
	}
	
	public void clickONBuyItNow() {
		
		EbayOrderPage ebayOrderPg = new EbayOrderPage(driver); 
        
        ebayOrderPg.ClickOnBuyItNow(driver).click();
	}
	

	public void closeTheTab() { 
		// Close the window
		driver.close();
		driver.quit();

	}

}
