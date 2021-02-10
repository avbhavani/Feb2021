package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import sample.BaseLaunch;

public class AlertsDemo extends BaseLaunch{

	public static void main(String[] args)throws Exception {
		launchBrowser("chrome", "file:///C:/Users/avsub/Desktop/Sonal_se/H2k/HTML/Alert.html");
		handlingAlerts();
	}

	public static void handlingAlerts()throws Exception {

		String b1= "//button[@name='btnAlert']";
		String b2 ="//button[@name='btnConfirm']";
		String b3 ="//button[@name='btnPrompt']";

		//handling simple alert
		driver.findElement(By.xpath(b1)).click();
		Thread.sleep(3000);
		String alertText =driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("alert1text:"+alertText);
		System.out.println("alert1 accepted");

		//handling confirmation alert

		driver.findElement(By.xpath(b2)).click();
		alertText = driver.switchTo().alert().getText();
		System.out.println("alert2 text:"+alertText);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("alert 2 accepcted");

		driver.findElement(By.xpath(b2)).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
       System.out.println("alert 2 dismissed");

		//handling prompt alert	
		driver.findElement(By.xpath(b3)).click();
		Thread.sleep(3000);
		alertText = driver.switchTo().alert().getText();
		System.out.println("alert3 text"+alertText);
		driver.switchTo().alert().accept();
		System.out.println("alert 3 accepcted");
		
		driver.findElement(By.xpath(b3)).click();
		driver.switchTo().alert().sendKeys("hello alert happy new year");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("alert 3 dismissed");





	}

}
