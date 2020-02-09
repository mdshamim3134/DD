package allExam;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
	public void cookies() {
		ChromeDriver dr= new ChromeDriver();
		String s="url";
		dr.navigate().to(s);
		Cookie c=new Cookie("n", "v");
		dr.manage().addCookie(c);
		Set<Cookie> cookies =dr.manage().getCookies();
      for(Cookie k:cookies) {
    	  System.out.println("k");
    	  
      }dr.manage().addCookie(c);
      dr.manage().deleteAllCookies();
      dr.manage().deleteCookieNamed(s);
      dr.manage().getCookieNamed(s);
      
	}

}
