package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sample.BaseLaunch;

public class WebdriverWait extends BaseLaunch{
	
	public static void main(String[] args)throws Exception {
		

	launchBrowser("chrome", "http://automationpractice.com/index.php");
	waitdemo();
}
//webdriver wait it will poll automatically for every 500 milliseconds /half a second 
//we can't customise polling frequency in webdriver wait.
//we use mostly this one when excpected conditions to be met,else fluientwait is commonly used one.

public static void waitdemo() {
	String logo ="//a[@title=\"My Store\"]/im";
	String cart ="//a/b[.='Cart']";
	String cart1 ="//a/b[.='Cart']/following-sibling::span[1]"; // failing path bcz no item in cart as per this path

	
	WebDriverWait wait  = new WebDriverWait(driver, 10);
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(logo))));
	System.out.println("element is visible");
	
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(cart1))));
	System.out.println("clicked on cart"); // it will fail with timeout exception bcz waited untill specified time
	//so after that also element not clicable and 
	
	waitUntillVisible(logo,11); // calling this from different method
	waitUntillVisible(cart,12);
}
	
//generic method we can call it where ever required
public static void waitUntillVisible(String xpath, int timeout) { // xapth we can give logo or cart as parameters
WebDriverWait wait  = new WebDriverWait(driver, timeout);
	
	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(xpath))));

	
}

}


