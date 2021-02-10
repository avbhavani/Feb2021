package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import sample.BaseLaunch;

public class JavaDocframe extends  BaseLaunch{
	public static void main(String[] args)throws Exception {
		
	
	launchBrowser("chrome","https://docs.oracle.com/javase/7/docs/api/");
	javadocframevaliadation();
	}
	
public static void javadocframevaliadation() {
	
	//int framesize=driver.findElements(By.tagName("frame")).size();
	
	List<WebElement>framelist= driver.findElements(By.tagName("frame"));
	int framesize= framelist.size();
	System.out.println("framesize in page:"+framesize);
	for(WebElement temp:framelist) {
	String framenmes=	temp.getAttribute("name");
	System.out.println("framenmes:"+framenmes);
	}
	
	driver.switchTo().frame("packageListFrame");
	String appletlink ="//li/a[.='java.applet']";
	driver.findElement(By.xpath(appletlink)).click();
	System.out.println("clicked  applet link in farme 1 ");
	
	driver.switchTo().defaultContent(); //switching to default
	System.out.println("switched to main");
	
	//frame2
	driver.switchTo().frame("packageFrame");
	String appletclass ="//li/a[.='Applet']";
	driver.findElement(By.xpath(appletclass)).click();
	System.out.println("clicked applet class in frame2");
	driver.switchTo().defaultContent(); //switching to default before switching to third
	System.out.println("switched to main");
	
	driver.switchTo().frame(2); 
	String frame3 = "//div[@class='header']/h2";
	boolean f3= driver.findElement(By.xpath(frame3)).isDisplayed();
	
		System.out.println("switching frame3 failed");
		System.out.println("switched to main");
/*	framenmes:packageListFrame
	framenmes:packageFrame
	framenmes:classFrame*/
	}
	
	
	//
	
}



