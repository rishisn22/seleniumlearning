package NewJavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Limitingdriverscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		  // LIMITING THE SCOPE OF WEB DRIVER.
	
		  System.out.println(driver.findElements(By.tagName("a")).size());
		  
		  WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		  
		  System.out.println(footerdriver.findElements(By.tagName("a")).size());
		  
		  WebElement columndriver = driver.findElement(By.xpath("//div [@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		  
		  System.out.println(columndriver.findElements(By.tagName("a")).size());
		  
		 for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		 {
			String sepratetab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			 columndriver.findElements(By.tagName("a")).get(i).sendKeys(sepratetab);
		 }
		 
		 
		 
	}

}
