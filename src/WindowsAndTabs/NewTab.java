package WindowsAndTabs;

import java.util.Set;

import org.openqa.selenium.By;

import sample.BaseLaunch;

public class NewTab extends BaseLaunch{

	public static void main(String[] args)throws Exception {
		//launchBrowser("Firefox","file:///C:/Users/avsub/Desktop/Sonal_se/H2k/HTML/MultiWindows.html");
		launchBrowser("chrome","file:///C:/Users/avsub/Desktop/Sonal_se/H2k/HTML/MultiWindows.html");
		newtabDemo();
	}
	
	public static void newtabDemo() throws Exception{
		String Ntab= driver.getWindowHandle();
		System.out.println("current window Id:"+Ntab);
		String netabpath ="//button[.='New Tab']";
		
		driver.findElement(By.xpath(netabpath)).click();
		
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("opend tabs size:"+tabs.size());
		System.out.println("all tabs id's are:"+tabs);
		
		for(String temp:tabs) {
			if(!temp.equalsIgnoreCase(Ntab)) {
			driver.switchTo().window(temp);
			String childT=driver.getTitle();
			System.out.println("title of child tab:"+childT);
			break;
		}
	}
		String downloads= "//*[@id='navbar']/a[1]"; //child tab element
		driver.findElement(By.xpath(downloads)).click();
		Thread.sleep(3000);
		driver.navigate().back(); // back to previous window
		Thread.sleep(3000);
		driver.close();
	driver.switchTo().window(Ntab);
	System.out.println("parent window title:"+driver.getTitle());
	boolean display =driver.findElement(By.xpath("//button[.= 'New Window'][2]")).isDisplayed();
	System.out.println("newWindow2 display:"+display);
	driver.quit();

	}

}
