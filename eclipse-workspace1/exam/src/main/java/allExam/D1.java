package allExam;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 {
	WebDriver dr;
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","\\Users\\shamama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.get("www.newtours.demoaut.com");
	}

}
