package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectWithMultiselctor extends BaseLaunch {


	public static void main(String[] args) throws Exception{
		//object 	
		SelectWithMultiselctor  select = new 	SelectWithMultiselctor ();
		select.launchBrowser("chrome", "file:///C:/Users/avsub/Desktop/Sonal_se/H2k/HTML/SelectDropdowns.html");
		//SelectclassMultipledropdowns();
		WithoutSelectTag();
	}


	public static void SelectclassMultipledropdowns()throws Exception {		
		//Destination dropdown
		String destination ="//select[@id='destination'] ";


		Select destin = new Select(driver.findElement(By.xpath(destination)));
		destin.selectByVisibleText("Las Vegas");
		Thread.sleep(2000);
		destin.selectByValue("someotherplace");

		System.out.println("is destinaton is a multi selector?:"+destin.isMultiple());


		//multiselector drop down
		String Carspath="//select[@name='cars']";  
		Select multiselec = new Select(driver.findElement(By.xpath(Carspath)));
		System.out.println("is multiselec drop down is a multiselector?:"+multiselec.isMultiple());

		multiselec.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		multiselec.selectByValue("ty");
		Thread.sleep(2000);
		multiselec.selectByIndex(7);

		//deselect option one by one
		multiselec.deselectByVisibleText("Volvo");
		multiselec.deselectByValue("ty");
		Thread.sleep(2000);
		multiselec.deselectByIndex(7);


		//deselect all at a time //will works only when drop down has deselect all option

		multiselec.selectByVisibleText("Opel");
		multiselec.selectByValue("BMW");
		multiselec.selectByValue("ho");
		multiselec.selectByValue("vw");
		Thread.sleep(2000);

		multiselec.deselectAll();

		//there is no selectAll method here in select class//but there is a get options method
	System.out.println("----------fetching multiselector cars drop down options avlue&text------------");	
		List<WebElement>dropdownlist= multiselec.getOptions();
		
		for(WebElement temp: dropdownlist) {
			System.out.println(temp.getAttribute("value")+"="+temp.getText());
		}
	}
	
public static void WithoutSelectTag() throws Exception {
	
	driver.get("https://jqueryui.com/selectmenu/");
	
	//frame is there here
	driver.switchTo().frame(0);
	
	String dropdown ="//span[@id='speed-button']";
	String dropdownelement= "//ul[@id='speed-menu']/li/div[contains(text(),'Slower')]";
	
	driver.findElement(By.xpath(dropdown)).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(dropdownelement)).click();
	
	
	
	
}




	}







