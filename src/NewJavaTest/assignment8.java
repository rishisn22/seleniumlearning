package NewJavaTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	
		List<WebElement> country =  driver.findElements(By.className("ui-menu-item"));
		
		
		for(WebElement option:country)
		{
			if(option.getText().equalsIgnoreCase("India"))

			{

			option.click();

			break;

			}
		}
	}

}
