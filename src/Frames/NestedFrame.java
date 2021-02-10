package Frames;

import org.openqa.selenium.By;

import sample.BaseLaunch;

public class NestedFrame extends BaseLaunch {

	public static void main(String[] args) throws Exception{

		launchBrowser("chrome","file:///C:/Users/avsub/Desktop/Sonal_se/H2k/HTML/FramesNested.html");
		nestedFrame() ;
	}

	//in nested frames always it will switch between parent and child 
	//from main frame it can go only to one frame  that is frame1(index0)-
	//-frame1 has one frmae (index0)--like that frame3 has one frame (index0)
	//

	public static void nestedFrame() {
		int Size =driver.findElements(By.tagName("iframe")).size();
		System.out.println("Size of frames:"+Size);

		//frame1 
		driver.switchTo().frame(0);  //parent
		Size =driver.findElements(By.tagName("iframe")).size();
		System.out.println("Size of frames in frame1:"+Size);

		//frame2
		driver.switchTo().frame(0);  //child 1
		Size =driver.findElements(By.tagName("iframe")).size();
		System.out.println("Size of frames in frame2:"+Size);

		//frame3
		driver.switchTo().frame(0);  //child 2
		Size =driver.findElements(By.tagName("iframe")).size();
		System.out.println("Size of frames in frame3:"+Size);

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='usePwd']")).sendKeys("admin123");
		System.out.println("entered uname and password");
		
		//switching to parent frame that is frame2
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[@name='Login']")).click();
		
		//finally default content
		driver.switchTo().defaultContent();  //going back to frame parent 
		

	}

}
