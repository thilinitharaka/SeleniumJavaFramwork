package Test;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseTest.BaseClass;
import functions.EbayOrder_Func;

public class EbayOrder extends BaseClass{

	ExtentReports extent;
	ExtentSparkReporter htmlReporter;

	private static WebDriver driver;

	@BeforeTest

	public void setUp() {

	
		
		// start reporters
		htmlReporter = new ExtentSparkReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		System.setProperty("webdriver.chrome.driver", "D://softwares//browserDrivers//chromedriver.exe");

		driver = new ChromeDriver();

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("E bay order ","This is a test to validate e-bay order");


		test.log(Status.INFO,"Starting test case");
		// Go to google.com
		driver.get("https://www.google.com/");
		test.pass("Navigate to the url");
	}

	@Test
	public void GoogleSearchFunctonality()throws Exception{

		
			String searchWord= prop.getProperty("text");
			String searchWord2= prop.getProperty("text2");
 
			ExtentTest test1 = extent.createTest("Place ebay order","This is a test to place ebay order");
			EbayOrder_Func EbayOrderFun = new EbayOrder_Func(driver);
			// GoogleSearch_Func.setUp();
			EbayOrderFun.searchText(searchWord);
			test1.pass("Enter value successfully");
			test1.addScreenCaptureFromPath("screenshot.png"); 
			Thread.sleep(5000);
			EbayOrderFun.eBayUrl1();
			test1.pass("Click on ebay url successfully");
			Thread.sleep(5000);
			EbayOrderFun.NavigateToProductScreen();
			test1.pass("Navigate to the product screen successfully");
			Thread.sleep(5000);
			EbayOrderFun.clickOnjewellary();
			test1.pass("Click on jewellary successfully");
			Thread.sleep(5000);
			EbayOrderFun.searchForjewellary(searchWord2);
			test1.pass("Search jewellary successfully");
			Thread.sleep(5000);
			EbayOrderFun.clickONjewellaryImage(); 
			test1.pass("Click on jwellery image successfully");
			Thread.sleep(5000);
		//	EbayOrderFun.clickONBuyItNow();
			
 
	}

	@AfterTest

	public void exist() {

		ExtentTest test2 = extent.createTest("Close Browser","This is to close browser");
		EbayOrder_Func EbayOrderFun = new EbayOrder_Func(driver);
		EbayOrderFun.closeTheTab();
		test2.pass("clocse the browser");

		test2.info("Test completed");
		extent.flush();
	}

}
