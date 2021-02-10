package javaScriptExe;

import java.io.IOException;

public class KillingDriversProcess {
	
	public static void killDrivers() throws IOException {
		// generally it is used to before and after automation to kill the process of open drivers at runtime.
		//it will be used insted of driver.quit();
		//it is from java ,it is killing browsers in system level.
		
		//Runtime.getRuntime().exec("taskkill/ F/IM geckodriver.exe");
		
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");		
		
		Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
	}
	
	

}
