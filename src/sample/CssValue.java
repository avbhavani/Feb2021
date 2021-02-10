package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class CssValue extends BaseLaunch {

	public static void main(String[] args)throws Exception {
		launchBrowser("chrome","http://automationpractice.com/index.php");
		CSSvalidation();
	}
	public static void CSSvalidation() {
		
		String signin="//div/a[@class='login']"; //sign in
		String emailbox="//input[contains(@name,'email_create')]";// email
		String createaccountbtn ="//button[@id='SubmitCreate']//i"; //click create account
		String afteremailpath ="//input[@id='email_create']";
		String errorxpath = "//li[contains(text(),'An account using this email address has already')]";
		String MrRadiobutton="//div[@id='uniform-id_gender1']";//click radio button
		String firstname ="//div/input[@id='customer_firstname']"; //first name
		String lastname ="//input[@id='customer_lastname']";//last name

	
		String emailverify ="//input[@id='email']"; //emailverify
		String pswd ="//input[@id='passwd']"; //paswd
		
		String  dayspath = "//Select[@id='days']";
		String monthspath ="//Select[@id='months']";
		String yearpath= "//Select[@id='years']";
		String mewsletter ="//input [@name='newsletter']";
		String firstname1 ="//input [@id='firstname'";
		String lastname1 ="//input [@id='lastname']";
		String company ="//input [@id='company']";
		String Address1="//input [@id='address1']";
		String  Address2="//input [@id='address2']";
		String city ="//input [@id='city']";
		String state ="//Select[@name='id_state']";
		String zipcode ="//input[@name='postcode']";
		String country ="id_country";
		String additionalInfo ="//textarea[@name='other']";
		String homePhone="//input[@id='phone']";
		String mobilephone="//input[@id='phone_mobile']";
		String Alias ="//input[@id='alias']";
		String register = "//button[@id='submitAccount']";
		
		driver.findElement(By.xpath(signin)).click(); //sign
		System.out.println("clicked on sign in");
		driver.findElement(By.xpath(emailbox)).sendKeys("RRsr@gmail.com");
		driver.findElement(By.xpath(createaccountbtn)).click();
		System.out.println("enterd email id and clicked on create user button");
		

		driver.findElement(By.xpath(MrRadiobutton)).click();
		
		driver.findElement(By.xpath(firstname)).sendKeys("rgb");
		driver.findElement(By.xpath(lastname)).sendKeys("ake");
		//before 
		String csscolor=	driver.findElement(By.xpath(emailverify)).getCssValue("color");
		String cssborder=	driver.findElement(By.xpath(emailverify)).getCssValue("background");

		System.out.println("cssborder of email box:"+cssborder+" , color is:"+csscolor);
		
		driver.findElement(By.xpath(emailverify)).click();
		//simulating click outside the box to get color and link
		 new Actions(driver).sendKeys(Keys.TAB).build().perform();
		String csscolorafter=	driver.findElement(By.xpath(emailverify)).getCssValue("color");
		String cssborderafter=	driver.findElement(By.xpath(emailverify)).getCssValue("background");
		String FontSize= driver.findElement(By.xpath(emailverify)).getCssValue("font-size");
			    
	System.out.println("cssborder of email box:"+cssborderafter+" , color is:"+csscolorafter);
	System.out.println("FontSize:"+FontSize);
	
		
	}

}


