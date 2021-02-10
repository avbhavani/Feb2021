package javaScriptExe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import sample.BaseLaunch;

public class ScreenShotDemoh2k extends BaseLaunch{
	
	public static void ScreenshotMethod()throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\avsub\\Downloads\\chromedriver_87\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File file = tk.getScreenshotAs(OutputType.FILE);
		
		Files.copy(file,new File("testimage.jpg"));
		
		
	}
	
	public static void killDrivers() throws IOException {
		// generally it is used to before and after automation to kill the process of open drivers at runtime.
		//it will be used insted of driver.quit();
		//it is from java ,it is killing browsers in system level.
		
		//Runtime.getRuntime().exec("taskkill/ F/IM geckodriver.exe");
		
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");		
		
		Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
	}

}
