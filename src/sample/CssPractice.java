package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssPractice {

	
	public static void main(String[] args)throws Exception  {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\avsub\\Downloads\\chromedriver_87\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	
	//driver.findElement(By.cssSelector(" div.header_user_info > a")).click();
	
	driver.findElement(By.cssSelector("a.login")).click();
	driver.findElement(By.cssSelector("input[name=email_create]")).sendKeys("agb@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[name=SubmitCreate]")).click();
	
	//driver.findElement(By.cssSelector("form>div>div>div>label>div>span>input#id_gender1")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span>input#id_gender1")).click();
	driver.findElement(By.cssSelector("div>input#customer_firstname")).sendKeys("agb");
	driver.findElement(By.cssSelector("div>input#customer_lastname")).sendKeys("ake");
	//driver.findElement(By.cssSelector("div>input#email")).sendKeys("agb@gmail.com");
	driver.findElement(By.cssSelector("div>input#passwd")).sendKeys("agb123@08");
	
	WebElement day= driver.findElement(By.cssSelector("#days"));
	
	Select  sele = new Select(day);
	
	sele.selectByIndex(8);

	WebElement month= driver.findElement(By.cssSelector("#months"));
	Select sele1 = new Select(month);
	sele1.selectByIndex(8);
	
	WebElement year= driver.findElement(By.cssSelector("#years"));
	Select sele2 = new Select(year);
	sele2.selectByIndex(35);
	
	driver.findElement(By.cssSelector("input#newsletter")).click();
	driver.findElement(By.cssSelector("input#company")).sendKeys("homecompany");
	driver.findElement(By.cssSelector("input#address1")).sendKeys("700 cam");
	driver.findElement(By.cssSelector("input#address2")).sendKeys("apt#116");
	driver.findElement(By.cssSelector("	input#city")).sendKeys("Hopkins");
	
	//state
	WebElement state =driver.findElement(By.cssSelector("select#id_state"));
	Select slec4 =  new Select(state);
	slec4.selectByVisibleText("Minnesota");
	
	//zip
	driver.findElement(By.cssSelector("p>input[name=postcode]")).sendKeys("55343");
	
	//country 
	WebElement country =driver.findElement(By.cssSelector("Select#id_country"));
	
	country.click();
	Select slec5 =  new Select(country);
	slec5.selectByIndex(1);
	
	//other info 
	driver.findElement(By.cssSelector("p>textarea#other")).sendKeys("nothing");
	//homephone //input#phone
	driver.findElement(By.cssSelector("input#phone")).sendKeys("612-409-3243");
	
	//mobile phone input#phone_mobile
	driver.findElement(By.cssSelector("input#phone_mobile")).sendKeys("612-216-1267");
	//alias address //input#alias
	driver.findElement(By.cssSelector("input#alias")).sendKeys("5045 cv");
	//register button //button#submitAccount
	driver.findElement(By.cssSelector("button#submitAccount")).click();
	

}
}
