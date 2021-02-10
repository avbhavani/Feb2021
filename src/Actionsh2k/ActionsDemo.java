package Actionsh2k;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import sample.BaseLaunch;

public class ActionsDemo extends BaseLaunch{

	public static void main(String[] args) throws Exception{
		launchBrowser("chrome", "https://jqueryui.com/");

		//useActions();
		buttonvalidation();
	}

	public static void useActions()throws Exception {
		Actions act = new Actions(driver);

		WebElement element =driver.findElement(By.xpath("//li/a[.='Selectable']"));
		Action build1 = act.click(element).build();//building all actions using Action interface
		build1.perform(); //performimng /executing builded actions

		driver.switchTo().frame(0);

		WebElement item1 = driver.findElement(By.xpath("//ol[@id='selectable']/li"));

		Action  builder2 = act.moveToElement(item1).build();
		builder2.perform();

		//switching to defaultcontent
		driver.switchTo().defaultContent();
		

		WebElement tooltip= driver.findElement(By.xpath("//li/a[.='Tooltip']"));
		Action builder3 = act.moveToElement(tooltip).click().build();
		builder3.perform();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement tipselements= driver.findElement(By.xpath("//p/a[.='Tooltips']"));

		//chord will do set of keyboard actions
		Thread.sleep(3000);

		Action builder4 = act.moveToElement(tipselements).click().sendKeys(Keys.chord(Keys.TAB,Keys.TAB))
				.keyDown(Keys.SHIFT).sendKeys("agb") //sending caps letters
				.sendKeys(Keys.chord(Keys.SHIFT,Keys.TAB,Keys.SHIFT,Keys.TAB)).build(); //multiple actions
		builder4.perform();

		//tool tip text
		String tooltiptext= driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		Thread.sleep(1000);

		System.out.println("tooltip1 text is :"+tooltiptext);

		//switching back to default 

		driver.switchTo().defaultContent();
/*
		WebElement button = driver.findElement(By.xpath("//li/a[.='Button']"));
		
		Action builder6 = act.moveToElement(button).click().build();
		builder6.perform();
		driver.close();*/

	}
	
	public static void buttonvalidation() throws InterruptedException {
		Actions act = new  Actions(driver);
		WebElement button = driver.findElement(By.xpath("//li/a[.='Button']"));
		button.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		/*Action builder6 = act.moveToElement(button).click().build();
		builder6.perform();
		Thread.sleep(3000);*/
	

		WebElement anchor =driver.findElement(By.xpath("/html/body/div/a"));
		anchor.click();
		Thread.sleep(3000);
		//WebElement submitdown =driver.findElement(By.xpath("/html/body/a"));
		/*Action builder7 =act.moveToElement(anchor).build();
		Thread.sleep(3000);
		builder7.perform();*/
		driver.close();

	}



	}


