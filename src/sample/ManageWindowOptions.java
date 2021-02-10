package sample;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class ManageWindowOptions extends BaseLaunch {
	public static void main(String[] args) throws Exception {
		launchBrowser("chrome", "https://www.google.com");
		ManageWindowOptions obj = new ManageWindowOptions();
		obj.managecookies();
		obj.manageWindows();
	}


	public void managecookies() {
		System.out.println("size of cookies:" +driver.manage().getCookies().size());
		System.out.println("avaialable cookies:"+driver.manage().getCookies());

		driver.manage().deleteAllCookies();
		System.out.println("after deleting cookies:"+driver.manage().getCookies().size());
		System.out.println("after deleting cookies :"+driver.manage().getCookies());
	}
	
	//===============================================================


	public void manageWindows() {
		System.out.println("size of window before maximize:"+driver.manage().window().getSize()); 
		System.out.println("position of window before maximize:"+driver.manage().window().getPosition());

		driver.manage().window().maximize();

		System.out.println("size of window after maximize:"+driver.manage().window().getSize());// (width,height)
		System.out.println("position of window after maximize:"+driver.manage().window().getPosition());

		driver.manage().window().fullscreen();

		System.out.println("size after full screen:"+driver.manage().window().getSize());

		System.out.println("position after full screen: "+driver.manage().window().getPosition());

		//point is a class to set position

		Point p = new Point(150, 500);
		
		driver.manage().window().setPosition(p);

		System.out.println("size after set position:"+driver.manage().window().getSize());

		System.out.println(" position after set position: "+driver.manage().window().getPosition());
		
		//dimension is a class to set size
		
		Dimension d = new Dimension(300, 500);
		
		driver.manage().window().setSize(d);
		System.out.println("size after set size:"+driver.manage().window().getSize());
		System.out.println("position after set size:"+driver.manage().window().getPosition());

//========================================================

	}
}