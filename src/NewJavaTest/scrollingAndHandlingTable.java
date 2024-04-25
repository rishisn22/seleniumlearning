package NewJavaTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingAndHandlingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
	List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	int sum = 0;
	
	for(int i=0; i<values.size() ;i++)
	{
		sum = sum + Integer.parseInt(values.get(i).getText());
	
	}
	
	System.out.println(sum);
	
	int totalAmount = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	
	
	
	if(totalAmount == sum)
	{ System.out.println("Sum is equal to Total Amount");
	}
	else
	{ System.out.println("Sum is not equal to Total Amount");
	} 
	}
}
