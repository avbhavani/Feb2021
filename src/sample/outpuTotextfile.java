package sample;



import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class outpuTotextfile {

	 static WebDriver driver;
	public static void main(String[] args)throws Exception {
		
		
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\avsub\\Downloads\\chromedriver_87\\chromedriver.exe");
  
   driver = new ChromeDriver();
   driver.get("https://classic.crmpro.com/");
   String title = driver.getTitle();
   System.out.println("hq page title: "+title);
   String pagesource = driver.getPageSource();
   
   System.out.println("pagesource is: "+pagesource );
   FileWriter fw  =null;
   try {
	   //File pagesourcetext pagesourcetext = new File("D://crmpro.html");
   fw = new FileWriter("pagesourcetext.html");
   
   fw.write(pagesource);
 
		
   }finally {
	   if (fw !=null) {
		   
		   fw.close();
		   
	   }
	 System.out.println("page source file created in project default directory"); 
	 Thread.sleep(1000);
	 driver.findElement(By.cssSelector("body > div.navbar.navbar-default.navbar-fixed-top.skrollable.skrollable-between > div > a > font")).click();
	// driver.close();//will close current browser
	 driver.quit(); //quit will close all the opend browsers
   }
	}
		
	/*	System.out.println("default position:"+driver.manage().window().getPosition());
		System.out.println("default size:"+driver.manage().window().getSize());
		
		driver.manage().window().maximize();
		
		System.out.println("after max position: "+driver.manage().window().getPosition());
		System.out.println("after max size: "+driver.manage().window().getSize());
		
		Point p = new Point(100,500);
		driver.manage().window().setPosition(p);
		
		System.out.println("after set position get position is : "+driver.manage().window().getPosition());
		System.out.println("after set position  size is: "+driver.manage().window().getSize());
		
		*/
		
		
	}


