package AllD;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	WebDriver dr;
	@Test
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shamama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.childrensplace.com");
	}

}
