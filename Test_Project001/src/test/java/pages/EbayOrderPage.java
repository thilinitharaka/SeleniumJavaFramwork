package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 

public class EbayOrderPage {

	static WebElement element = null;
	WebDriver driver = null;

	public EbayOrderPage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement searchTextBox(WebDriver driver) {

		element = driver.findElement(By.xpath("//textarea[@title=\"Search\"]"));
		return element;
	}

	public WebElement searchButton(WebDriver driver) {

		element = driver.findElement(By.xpath("(//input[@name=\"btnK\"])[2]"));
		return element;
	}
	
	public WebElement eBayUrl(WebDriver driver) {

		element = driver.findElement(By.xpath("(//cite[contains(text(),'https://www.ebay.com')])[1]"));
		return element;
	}
	
	public WebElement fashionElement(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[@data-currenttabindex=2]//a[contains(text(),'Fashion')]"));
		return element;
	}
	
	public WebElement jewellaryElement(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[@data-currenttabindex=2]//a[contains(text(),'Jewelry')]"));
		return element;
	}
	
	public WebElement searchTextBox2(WebDriver driver) {

		element = driver.findElement(By.name("_nkw")); 
		return element;
	}
	
	public WebElement searchButton2(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@type='submit']"));
		return element;
		
	}
	
	public WebElement image(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//div[@class='s-item__image'])[2]"));
		return element;
		
	}
	
	public WebElement ClickOnBuyItNow(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//span[contains(text(),'Buy It Now')]"));
		return element;
		
	}
	
	
}
