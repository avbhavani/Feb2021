package javaScriptExe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import sample.BaseLaunch;

public class JsheighletElement extends BaseLaunch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("chrome","https://www.facebook.com/login.php");
		heighletElement() ;
	}
	
	public static void heighletElement() throws Exception {
		
		WebElement element = driver.findElement(By.id("email"));
		WebElement element1 = driver.findElement(By.id("pass"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//heigh let element border color red
	//	js.executeScript("arguments[0].setAttribute('style','border:2px solid red;');",element);
		
		//heighlet element border and back ground color
		
		//js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background: green'); ",element1);
		
		//heighlet yellow color 
		js.executeScript("arguments[0].setAttribute('style','background: yellow');",element);
		
		//heighletting and removing colors
		
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background: green'); ",element1);
		
		
		// removing heighlet colors
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style','background: ');",element);
		
		js.executeScript("arguments[0].setAttribute('style','border:; background: '); ",element1);


		
		
		
	}

}
