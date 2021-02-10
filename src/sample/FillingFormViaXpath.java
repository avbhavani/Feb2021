package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FillingFormViaXpath extends  BaseLaunch {

	public static void main(String[] args) throws Exception  {
		launchBrowser("chrome","http://automationpractice.com/index.php");
		verifycreateaccount("hvsr@gmail.com");

	}
	
	public static void verifycreateaccount(String email) {
	////a[normalize-space(text())='Sign in']
			String signin="//div/a[@class='login']"; //sign in
			String emailbox="//input[contains(@name,'email_create')]";// email
			String createaccountbtn ="//button[@id='SubmitCreate']//i"; //click create account
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
			driver.findElement(By.xpath(emailbox)).sendKeys("hvsr@gmail.com");
			driver.findElement(By.xpath(createaccountbtn)).click();
			System.out.println("enterd email id and clicked on create user button");
			
			
			//validating error while creating account
		try {	
			
		if(driver.findElement(By.xpath(errorxpath)).isDisplayed()) {
			System.out.println("error.......... user already exist");
		} // it might through an exception if we create with new user
		//so handle with try catch block
		}catch(Exception e){
			System.out.println("NoSuchElement exception ignored");
		}
		
			driver.findElement(By.xpath(MrRadiobutton)).click();
			
			driver.findElement(By.xpath(firstname)).sendKeys("rgb");
			driver.findElement(By.xpath(lastname)).sendKeys("ake");
			
			//here we are verifying email
			
		String actualemail=	driver.findElement(By.xpath(emailverify)).getAttribute("value"); //value is email here
			
			if(actualemail.equalsIgnoreCase(email)) {
				System.out.println("email validation sucessfull");
			}else {
				System.out.println("email validation failed");
			}
			
		driver.findElement(By.xpath(pswd)).sendKeys("1234567890");	
	
		//in this select class there is no visible text in tom,depends on dom we should choose 
		//select by index, visible text or value
		//select class willaccepect webelement as parameter
		Select day = new Select(driver.findElement(By.xpath(dayspath)));
		day.selectByValue("10");
		
		Select month = new Select(driver.findElement(By.xpath(monthspath)));
		month.selectByIndex(5);
		
		Select year = new Select(driver.findElement(By.xpath(yearpath)));
		year.selectByIndex(9);
		
		//checkbox
		driver.findElement(By.xpath(mewsletter)).click();
		boolean  returnflag =driver.findElement(By.xpath(mewsletter)).isSelected();
		System.out.println("wheather checkbox selected :"+returnflag);
		
		//driver.findElement(By.xpath("firstname1")).sendKeys("agb");
		//driver.findElement(By.xpath(lastname1)).sendKeys("ake");
		driver.findElement(By.xpath(company)).sendKeys("home");
		driver.findElement(By.xpath(Address1)).sendKeys("700 cam");
		driver.findElement(By.xpath(Address2)).sendKeys("5045 cv");
		driver.findElement(By.xpath(city)).sendKeys("Mn");
		
		//it has visible text
		Select stateslect = new Select(driver.findElement(By.xpath(state)));
		stateslect.selectByVisibleText("Minnesota");
		
		driver.findElement(By.xpath(zipcode)).sendKeys("55343");
		//driver.findElement(By.xpath(country)).click();
		
		driver.findElement(By.xpath(additionalInfo)).sendKeys(" no info available \n line1 \n line2");
		
		driver.findElement(By.xpath(homePhone)).sendKeys("123356788");
		driver.findElement(By.xpath(mobilephone)).sendKeys("162408788");
		driver.findElement(By.xpath(Alias)).sendKeys("no alias");
		driver.findElement(By.xpath(Alias)).sendKeys("no alias");
		driver.findElement(By.xpath(register)).click();
		
		String confirmationpath ="//p[contains(text(),'Welcome to your account')]";
		boolean confimationflag=driver.findElement(By.xpath(confirmationpath)).isDisplayed();
		
		System.out.println("user account creation sucessful :"+confimationflag);
		
		

			
			
			
	}

}
