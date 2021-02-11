package Actionsh2k;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import sample.BaseLaunch;

public class DragAndDrop extends BaseLaunch{

	
		public static void main(String[] args) throws Exception{
			launchBrowser("chrome", "https://jqueryui.com/droppable/");
			dragAndDropOperation();

	}
		
public static void dragAndDropOperation()throws Exception {
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act = new Actions(driver);
	
	Action build = act.dragAndDrop(drag, drop).build();
	build.perform();
	Thread.sleep(2000);
	System.out.println("drag&drop opeartion completed:");
	
	driver.switchTo().defaultContent();
	driver.quit();
	
	System.out.println("line added in eclipse 112021");
	
	System.out.println("line 1 added in eclipse 112021");
	
	
	
}

}
