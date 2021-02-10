package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	
	
	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\avsub\\Downloads\\chromedriver_87\\chromedriver.exe");

	int num =12345;
	
	int r = 0;
	
	while(num!=0) {
		int rm = num%10;
		r =r*10+ rm;
		num = num/10;
		
	}
	System.out.println(r);
	if(r!=num) {
		System.out.println("p");
		
	}else {
		System.out.println("np");
	}
	}
}

	



	
