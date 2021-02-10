package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import sample.BaseLaunch;

public class FluientWaitDemo extends BaseLaunch {

	public static void main(String[] args) throws Exception {

		launchBrowser("chrome", "http://automationpractice.com/index.php");

		testFluentWait();
		
	}
	
	public static void testFluentWait() {
		
		String logo = "//a[@title='My Store']/img";
		String cart = "//a/b[.='Cart']/following-sibling::span[.='1']";
		
		WebElement logoEle = fluentWait(logo, 50, 10); //calling generic method fluentWait return type is WebElement ,that is why applying to Wbelement 
		logoEle.click(); //it will pass
		
		WebElement cartEle = fluentWait(cart, 60, 15); //this will fail bcz not available
		cartEle.click();
		
	}
	
	/*
	 
Implicit wait: If element is not visible with in the specified time it will throw nonsuch element exception
Explicit Wait: if element is not available with in the specified time it will throw timeout exception.
--if we use and explicit and implicit wait together it will override the implicit  wait
--by default it will keep polling every 500msec
Fluientwait:
Functional interface is an advance concept, here we no need to create child class to implement interface we will directly implement when declaring the method.
--fluent wait will be mostly useful when we have a dynamic element loading via Ajax calls

Interface with single method called functional interface.
•	Mostly we use fluent wait commonly by creating as one generic method 
In Realtime.
    But in case if we are checking specific condition like eg: element to be clickable, tittleIs methods and all we should use WebdriverWait.

	 */
	
	
	public static WebElement  fluentWait(String xapth, int timeout, int polltime) {
		
		Wait wait = new FluentWait(driver)
						.withTimeout(Duration.ofSeconds(timeout))
						.pollingEvery(Duration.ofSeconds(polltime))
						.ignoring(Exception.class);
		
		
		WebElement ele = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
				 							public WebElement apply(WebDriver driver) {
				 								WebElement element = driver.findElement(By.xpath(xapth));
				 								return element;
				 							}
										});
		return ele;

	
}
}
