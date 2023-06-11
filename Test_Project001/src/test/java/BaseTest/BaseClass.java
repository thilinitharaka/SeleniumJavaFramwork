package BaseTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public WebDriver driver;
	public static ExtentReports extent = new ExtentReports();
	public static ExtentTest log;


	final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	String currenttimestamp = sdf.format(timestamp);
	public static Properties prop= new Properties();
	static String projectPath=System.getProperty("user.dir");

	ExtentSparkReporter htmlReporter;

	@BeforeTest
	public void beforeTest() throws Exception {



		Thread.sleep(6000);
		InputStream input= new FileInputStream(projectPath+"/src/test/java/DataPropertyFiles/EbaySearchTestData.properties");	
		prop.load(input);
		OutputStream output = new FileOutputStream(projectPath+"/src/test/java/DataPropertyFiles/EbaySearchTestData.properties");
		prop.store(output, null);


	}

}
