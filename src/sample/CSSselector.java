package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
	
	
public static void main(String[] args) {
	

System.setProperty("webdriver.chrome.driver", "C:\\Users\\avsub\\Downloads\\chromedriver_87\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();

//with id attribute
driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Casual dresses");


//with classname attribute
String text =driver.findElement(By.cssSelector("input.search_query ")).getText();
System.out.println("text of serc box:"+text);

//id and type attribute
driver.findElement(By.cssSelector("input.search_query[type=text]"));

//classname and name attribute
driver.findElement(By.cssSelector("input.search_query[name=search_query]"));

//id and classname togeteher
driver.findElement(By.cssSelector("input#search_query_top.search_query")).click();


//only coomonly use attribute eg:[type=text] when there is no ID and classname not avialable 

	
//when ever we want to locate the dynamic elements we use prefix or suffix or substring in css with partial value
// this mechanism apply only for attributes 


//prefix represents ^(cap symbol) of name attribute

driver.findElement(By.cssSelector("input[name^=search]")).click();

//postfix represents $(dollar symbol) of name attribute
driver.findElement(By.cssSelector("button[name$=search]")).click();

//substring represents *(star symbol) of name attribute 
driver.findElement(By.cssSelector("button[name*=t_s]")).click(); // we are writing middle of string

//substring starts with
driver.findElement(By.cssSelector("button[name*=se][type^=sub]")).click();

//substring starts classname
driver.findElement(By.cssSelector("button[name*=se].btn")).click();

//immidiate parent with angular backet(>) --grater symbol
//form>button  //parent > child 

//grand parent and immidiate parent with angular backet(>) 
//div>form>button  //grandparent > parent >child 

//grandparent  is identified with with space 

//div button  //where ever it is // in this case div is grandparent

//grandparent and immidiate parent together

//div form> button

//siblings share the same father ,it represents + symbol

//form input+input+input+input //It used to refer the next sibling of a node 

/*
CSS locator: nth-child or nth-of-type 
It used to navgate find the nth child of a list  
Example:  select > option:nth-child(4)*/

//form input:nth-of-type(4) //form is parent input is 4th type of child 

//form input:nth-child(4) //form is parent input is 4th child 


}

}	