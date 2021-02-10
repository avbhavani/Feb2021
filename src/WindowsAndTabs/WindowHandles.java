package WindowsAndTabs;

import java.util.Set;

import org.openqa.selenium.By;

import sample.BaseLaunch;

public class WindowHandles  extends BaseLaunch{

	public static void main(String[] args)throws Exception {
		launchBrowser("chrome", "file:///C:/Users/avsub/Desktop/Sonal_se/H2k/HTML/MultiWindows.html");

		handlingWindows();
	}

	public static void handlingWindows()throws Exception {
		String currentwindowid =driver.getWindowHandle();

		System.out.println("current window is:"+currentwindowid);

		Thread.sleep(2000);
		String b1 ="//button[@id='nwindow1']";

		driver.findElement(By.xpath(b1)).click();

		System.out.println("clicked on new window button");

		Set<String>windows= driver.getWindowHandles();
		System.out.println("windows size:"+windows.size());
		System.out.println("open windows are:"+windows);
		for(String temp:windows) {
			if(!temp.equalsIgnoreCase(currentwindowid)) {
				System.out.println("switching to second window");
				driver.switchTo().window(temp);
				break;
			}
		}


		String freedemo="//button[.='FREE DEMO']"; //in secondwindow
		String submit="//button[@id='simpleContactSubmitButton']";//in secondwindow

		driver.findElement(By.xpath(freedemo)).click();
		driver.findElement(By.xpath(submit)).click();
		System.out.println("performed operatins in second window");
		String secondwindowid =driver.getTitle();
		System.out.println("secondwindow title:"+secondwindowid);
		driver.close(); //closing chid window

		//switching back to parent window

		driver.switchTo().window(currentwindowid);
		System.out.println("parent window title:"+driver.getTitle());
		String newtab= "//button[.='New Tab']";
		boolean tab=driver.findElement(By.xpath(newtab)).isDisplayed();

		System.out.println("new tab displayed:"+tab); 
		driver.quit();//closing all open windows during runsession of this program

	}

}
