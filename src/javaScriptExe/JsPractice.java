package javaScriptExe;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import sample.BaseLaunch;

public class JsPractice extends BaseLaunch {
	
	public static void main(String[] args) throws Exception{
		launchBrowser("chrome","https://www.google.com/");
		
		jsdemo();
	}
	
	public static void jsdemo()throws Exception {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
	//1	
	String title =	(String) js.executeScript("return document.title;");
	System.out.println("title :"+title);
	
		//2
		String url =js.executeScript("return document.URL;").toString();
		System.out.println("url:"+url);
		
		WebElement id = driver.findElement(By.id("gbqfbb"));
		//3
	String text =	(String) js.executeScript("arguments[0].text;",id);
	System.out.println("text :"+text);
		
		//4
		WebElement serchbox =driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value='QA';",serchbox);
		

		Thread.sleep(2000);
		//6
		js.executeScript("window.	location='https://www.selenium.dev/downloads/' ");
		//js.executeScript("window.loaction='https://www.selenium.dev/' ");
		
		//7
		js.executeScript("window.scrollBy(0,700)");
		
		//8
		//js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement header = driver.findElement(By.xpath("//a[@class='headerLink']"));
		//9
		js.executeScript("arguments[0].scrollIntoView();",header);
		
	}

}
