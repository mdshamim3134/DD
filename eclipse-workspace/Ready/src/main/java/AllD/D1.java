package AllD;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class D1 {
	
	WebDriver dr;
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shamama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		dr.get("https://www.macys.com");
		//dr.switchTo().frame(0);
		
		//dr.switchTo().alert().accept();
		dr.findElement(By.xpath(".//*[@id='link-rail']/div/div/div[1]/nav/ul/li[1]/a")).click();
		dr.navigate().back();
		//dr.findElement(By.xpath(".//*[@id='globalSearchInputField']")).sendKeys("dress");
		//dr.findElement(By.xpath(".//*[@id='searchSubmit']")).click();
		//dr.quit();
		Actions ac=new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath(".//*[@id='shopByDepartmentLabelText']"))).perform();
		List<WebElement> element= dr.findElements(By.xpath(".//*[@id='mainNavigation']/div/div/div"));
		//for(WebElement e:element) {
			//e.click();
			int size=element.size();
			for(int i=1;i<size;i++) {
				element.get(i).getText().contains("asma");
			}
		}
		//while(b.hasNext()) {
			//System.out.println(b.next());
		
		}
		
	


