package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FNOPBaseclass2 {

	public static WebDriver driver;
	public static Properties p = new Properties();
	public static FileInputStream fis;

	public static ExtentReports reports = new ExtentReports();
	public static ExtentHtmlReporter htmlreport;
	public static ExtentTest extest;

	@BeforeTest
	public void Setup() {
		htmlreport = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\FNOPReport.html");
		reports.attachReporter(htmlreport);
		htmlreport.config().setDocumentTitle("FNOP COMMERCE TEST");
		htmlreport.config().setReportName("Report");
		htmlreport.config().setTheme(Theme.DARK);
		
		reports.setSystemInfo("Host Name", "USA");
		reports.setSystemInfo("OS", "Windows10");
		reports.setSystemInfo("Tester Name", "Fokhrul");
		reports.setSystemInfo("Browser Name", "Chrome");
	}

	@BeforeMethod
	public void setup() throws IOException {

		File f = new File("C:\\Users\\fokhrul1755\\eclipse-workspace\\SeleniumBasics\\NOP\\Utility\\Config.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		

		if (p.getProperty("Browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(p.getProperty("Testurl"));
		}

		else if (p.getProperty("Browser").equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(p.getProperty("Testurl"));
		}

		else if (p.getProperty("Browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			driver.get(p.getProperty("Testurl"));

		}
		driver.manage().window().maximize();
	}
	
	
	
	@AfterMethod
	public void aftermethod() {
		driver.close();
	}
 
	@AfterTest
	public void aftertest() {
		reports.flush();
	}

}
