package alerts;

import org.openqa.selenium.By;

import sample.BaseLaunch;

public class DialogBox  extends BaseLaunch{


			public static void main(String[] args)throws Exception {
				launchBrowser("chrome", "file:///C:/Users/avsub/Desktop/Sonal_se/H2k/HTML/Dialog.html");
				handlingDialog();
			}
			
	public static void handlingDialog()throws Exception {
		
		String uname="//input[@id='username']";
		String pswd="//input[@id='pwd']";
		String loginbtn="//button[@id='myBtn']";
		String logon="//button[@name='Login']";
		String close="//span[@class='close']";
		
		driver.findElement(By.xpath(loginbtn)).click();
		
		if(driver.findElement(By.xpath(uname)).isEnabled()) {
			System.out.println("dialogbox displayed");
		}else {
			throw new Exception("dialog box not found");
		}
		
		//driver.findElement(By.xpath(close)).click(); //to close the window without entering data
	driver.findElement(By.xpath(uname)).sendKeys("Admin");
	driver.findElement(By.xpath(pswd)).sendKeys("Admin1624");
	Thread.sleep(3000);
	driver.findElement(By.xpath(logon)).click();

		
	}

}
