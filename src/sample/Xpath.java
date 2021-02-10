package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends BaseLaunch{
	public static void main(String[] args)throws Throwable {
		launchBrowser("chrome", "http://automationpractice.com/index.php");

		xpathpractice();

		createaccount();
	}

	public static void xpathpractice() {
		//int si=driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li[2]")).size();

		//one way to get all the text in links
		/*List<WebElement> li = driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li/a"));
for(WebElement ele: li) {
	String liLinks =ele.getAttribute("href");
	System.out.println("liLinks are:"+liLinks +"  ,"+"tex is:"+ele.getText());

	if(ele.getText().equalsIgnoreCase("Women")) {
	ele.click();
	}
		 */

		//using dynamic dummie string and replace it

		/*String linkpath = "//a[text()='dyntext']";
		driver.findElement(By.xpath(linkpath.replace("dyntext" ,"Women"))).click();
		driver.findElement(By.xpath(linkpath.replace("dyntext","Dresses"))).click();
	    driver.findElement(By.xpath(linkpath.replace("dyntext","T-shirts"))).click();*/
		
		driver.findElement(By.xpath("//ul[contains(@class,'sf-menu')]/li/a[text()='Dresses']"));//dresses



	}


	public static void createaccount() {
		////a[normalize-space(text())='Sign in']
		String signin="//div/a[@class='login']"; //sign in
		String email="//input[contains(@name,'email_create')]";// email
		String createaccount ="//button[@id='SubmitCreate']//i"; //click create account
		String Radiobutton="//div[@id='uniform-id_gender1']";//click radio button
		String firstname ="//div/input[@id='customer_firstname']"; //first name
		String lastname ="//div[@id='uniform-id_gender1']";//last name

		
		String emailverify ="//input[@id='email']"; //emailverify
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("1234567890"); //paswd
		
		String dayspath = "//Select[@id='days']";
		String monthspath ="//Select[@id='months']";
		String yearpath= "//Select[@id='years']";
		String mewsletter ="//input [@name='newsletter']";
		String firstname1 ="//input [@id='firstname']";
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
		
		
		
		
	}


	//driver.findElement(By.id("http://automationpractice.com/index.php")).sendKeys("Summer dresses");



}

