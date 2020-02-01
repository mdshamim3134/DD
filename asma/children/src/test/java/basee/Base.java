package basee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	WebDriver dr;
	@Test
	public void openBrowser() {
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\shamama\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	dr=new ChromeDriver();
	dr.get("https://www.childrensplace.com/");
	
	}

}
