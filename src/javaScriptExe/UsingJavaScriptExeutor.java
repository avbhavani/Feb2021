package javaScriptExe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import sample.BaseLaunch;

public class UsingJavaScriptExeutor  extends BaseLaunch{

	public static void main(String[] args) throws Exception{
		launchBrowser("chrome","http://automationpractice.com/");
	
		jsExecutorMethod();
	}
	
	public static void jsExecutorMethod() throws Exception{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		
	//1.eual to getting page url in selenium
		//String Pageurl = js.executeScript("return document.URL;").toString(); //or  //convert to string instaed of casting
		String Pageurlcast = (String) js.executeScript("return document.URL;"); //casting
	
		System.out.println("page url-->"+Pageurlcast);
		Thread.sleep(2000);
		//2.equal to driver.gettittle(); in selenium
		String Title = (String) js.executeScript("return document.title;");
		System.out.println("pageTitle-->"+Title);
		Thread.sleep(2000);
		
		//3.equal to send keys 

		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='search_query']")); //search box enter value
		js.executeScript("arguments[0].value='T-shirts';",searchbox);
		
		//4
		WebElement searchbtn = driver.findElement(By.name("submit_search")); // click on search btn
		js.executeScript("arguments[0].click();",searchbtn );
		
		//5
		WebElement GetText = driver.findElement(By.xpath("//h1/span")); //get text of tshirts
		js.executeScript("arguments[0].text;",GetText ); //t-shirts  text
		
		//6
		Thread.sleep(2000);
		//4.naviagate to different url seleniumhq 
		js.executeScript("window.	location='https://www.selenium.dev/downloads/' ");
		
		//7.scrolling to 500 pixels 
		
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		
		//8.scroll total height of scroll bar
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//9.scroll to view of element // in this scenario coimg up from the bottom of page bcz element is up
		WebElement header = driver.findElement(By.xpath("//a[@class='headerLink']"));
		js.executeScript("arguments[0].scrollIntoView();", header);
		Thread.sleep(2000);
			
		// 10.using Javascript and we can do displaying alert via dvelopers tools as well
		js.executeScript("alert('hello')");
		
		
	}

}
