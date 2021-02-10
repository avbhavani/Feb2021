package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseLaunch {
	

	
		
		public static WebDriver driver;
		
		public static void launchBrowser(String bname, String url) throws Exception  {
			
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver_20\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\avsub\\Downloads\\chromedriver_87\\chromedriver.exe");
				
			if(bname.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			} else {
				driver = new ChromeDriver();
			}
			
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
			driver.manage().timeouts().setScriptTimeout(20,  TimeUnit.SECONDS); // client side script like java ,vbscript all will take some time 
			//in some some instances to load in that case we will use it  
			
			
		}

	}

	
	

