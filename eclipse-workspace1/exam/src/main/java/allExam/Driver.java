package allExam;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	WebDriver dr;
	public void driverDr() {
		String s=System.setProperty("browser", "");
		if(s.equals("c"))
		{
			System.setProperty("", "");
			dr=new ChromeDriver();
		}else if(s.equals("f"))
		{
			System.setProperty("", "");
			dr=new FirefoxDriver();
			
		}else if(s.equals("ie"))
		{
			System.setProperty("", "");
			dr=new InternetExplorerDriver();
		}
		
	}
	public void Cookies() {
		dr=new ChromeDriver();
		String s="Url";
		dr.navigate().to(s);
		Cookie name=new Cookie("name","value");
		dr.manage().addCookie(name);
        Set<Cookie>cookies=dr.manage().getCookies();
        
        for(Cookie c:cookies)
        {
        	System.out.println(c);
        }
        dr.manage().deleteAllCookies();
        dr.manage().deleteCookie(name);
        dr.manage().getCookieNamed(s);
        dr.manage().getCookies();
	}
	

}
