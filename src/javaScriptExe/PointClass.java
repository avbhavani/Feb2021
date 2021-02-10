package javaScriptExe;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

import sample.BaseLaunch;

public class PointClass extends BaseLaunch{

	public static void main(String[] args)throws Exception {
		
		launchBrowser("chrome","https://www.selenium.dev/");
		
		pointdemo();
		//DimensionsDemo();
	//	RectangleDemo();
		
	}
	WebElement header = driver.findElement(By.xpath("//a[@class='headerLink']"));
		public static void pointdemo() throws Exception {
			WebElement header = driver.findElement(By.xpath("//a[@class='headerLink']"));
			
			Point  pointobj =header.getLocation(); //this method get both x and y pixles 
			System.out.println("point x and y pixles :"+pointobj);
			//System.out.println(header.getLocation().getX());  //or
				System.out.println("point x pixles:"+pointobj.getX()); //this method get  x pixles 
				System.out.println("point y pixles:"+pointobj.getY());  //this method ge y pixles 
				
				ScreenShotDemoh2k.ScreenshotMethod();
				//KillingDriversProcess.  killDrivers() ;
				driver.quit();
	}
		
		public static void DimensionsDemo() throws Exception {
			WebElement header = driver.findElement(By.xpath("//a[@class='headerLink']"));
			Dimension  dim = header.getSize();
			System.out.println("dim header wdth and height:"+dim);
			//System.out.println("hegiht of header:"+dim.height);
			//System.out.println("hegiht of header:"+dim.width);
			System.out.println("dim hegiht of header:"+header.getSize().height);
			System.out.println("dim width of header :"+header.getSize().width);


			KillingDriversProcess.  killDrivers() ;
			
		}
	// this Rectangle class has functionalities of Dimension class and Point class
	//using rectangle class we can get the both x and y pixles and height and width of webelement
		public static void RectangleDemo() throws Exception {
			WebElement header = driver.findElement(By.xpath("//a[@class='headerLink']"));
			Rectangle rect = header.getRect();
			System.out.println("rect x:"+rect.getX());
			System.out.println("rect y:"+rect.getY());
			System.out.println("rect height:"+rect.getHeight());
			System.out.println("rect width:"+rect.getWidth());
			
			KillingDriversProcess.  killDrivers() ;
		}
		

}
