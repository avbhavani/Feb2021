package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import sample.BaseLaunch;

public class Frames extends BaseLaunch {

	public static void main(String[] args) throws Exception{

		launchBrowser("chrome","file:///C:/Users/avsub/Desktop/Sonal_se/H2k/HTML/Frames.html");
		frameshandling() ;
	}



	public static boolean frameshandling()throws Exception {
		int Size =driver.findElements(By.tagName("frame")).size();
		System.out.println("frames Size:"+Size);

		//switching to frame1
		driver.switchTo().frame(0);
		String frame1 = "//input[@id='Frame1txt']";

		if(driver.findElement(By.xpath(frame1)).isDisplayed()) {
			System.out.println("in frame 1");
			driver.findElement(By.xpath(frame1)).clear();
			driver.findElement(By.xpath(frame1)).sendKeys("new text1");
			Thread.sleep(2000);
		}else {
			System.out.println("failed to switch to frame1");
			return false;
		}
		driver.switchTo().defaultContent();
//**********************************************
		//switching to frame2

		driver.switchTo().frame("frame_b"); //by frame name
		
		String frame2 ="//input[@id='Frame2txt']";
		
	if(driver.findElement(By.xpath(frame2)).isDisplayed()) {
		System.out.println("in frame2");
		driver.findElement(By.xpath(frame2)).clear();
		driver.findElement(By.xpath(frame2)).sendKeys("fram2 new  text");
		Thread.sleep(2000);
	}else {
		System.out.println("switching to  frame2 failed");
		return false;
	}
	
	//***************************************
driver.switchTo().defaultContent();
	//switching to farme3
driver.switchTo().frame(2);
//	driver.switchTo().frame("frame_c");
	String frame3 ="//input[@id='Frame3txt']";
	if(driver.findElement(By.xpath(frame3)).isDisplayed()) {
		System.out.println("in frame3");
		driver.findElement(By.xpath(frame3)).clear();
		driver.findElement(By.xpath(frame3)).sendKeys("fram3 new  text");
		Thread.sleep(2000);
	}else {
		System.out.println("switching to  frame3failed");
		return false;
	}
	
	driver.switchTo().defaultContent();
	System.out.println("title of default content page:"+driver.getTitle());

		return true;



	}


	public static void nestedFrame() {
		int Size =driver.findElements(By.tagName("frame")).size();
		System.out.println("line added in eclipse frames");

	}
}
