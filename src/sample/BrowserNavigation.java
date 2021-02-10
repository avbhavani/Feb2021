package sample;

public class BrowserNavigation extends BaseLaunch {
	public static void main(String[] args) throws Exception {
		launchBrowser("firefox", "https://www.google.com/");
		//https://www.google.com/
	}
	
	
	
	public void navigatemethods() {
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
	}

}
