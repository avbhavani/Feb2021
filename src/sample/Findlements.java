package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findlements {
	
	
	
	public static void main(String[] args) throws Exception{
		
	
	
		
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\avsub\\Downloads\\chromedriver_87\\chromedriver.exe");
  
  WebDriver  driver = new ChromeDriver();
  driver.get("http://automationpractice.com/index.php");
  driver.manage().window().maximize();
  
  List<WebElement> inputs = driver.findElements(By.tagName("input"));
  int inputsize =inputs.size();
  System.out.println("inputsize: "+inputsize);
  
  inputs.get(3).click();
  Thread.sleep(2000);
  inputs.get(3).sendKeys("Summer dresses");
  inputs.get(3).clear();
  
  
  List<WebElement> buttons = driver.findElements(By.tagName("button"));
  
  System.out.println("button size: "+buttons.size());
  buttons.get(0).click();// click search
  Thread.sleep(2000);
  
 //without using list  
  System.out.println(driver.findElements(By.tagName("input")).size());
  driver.findElements(By.tagName("input")).get(3).click();
  driver.findElements(By.tagName("input")).get(3).sendKeys("dresses");
  Thread.sleep(2000);
 driver.findElement(By.cssSelector("button[type=submit]")).click();
 
  
  


}
	
}
