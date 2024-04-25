package NewJavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rishu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input [@value='option2']")).click();
		
		String text = driver.findElement(By.xpath("//label [@for='benz']")).getText();
			
		System.out.println(text);
		
		Select drop = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		drop.selectByVisibleText(text);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		if(alerttext.contains(text))

		{
			System.out.println("Alert Sucesss");
		}
		else
		{
			System.out.println("Alert not matched");
		}
		
		
	}

}
