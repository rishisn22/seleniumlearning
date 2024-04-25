package NewJavaTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
				
		//Scenario1: No. 0f Rows in Table.
		int rows = driver.findElements(By.xpath("//table [@class='table-display'] //tr")).size();
		
		System.out.println("No. of column = "+rows);
		
		//Scenario2: No. of Rows.
		int column = driver.findElements(By.xpath("//table [@class='table-display'] //th")).size();
		System.out.println("No. of rows = "+column);
		
		//Scenario3
	    String text = driver.findElement(By.xpath("//table [@class = \"table-display\"]//tr[3]")).getText();
	    System.out.println(text);
		
	}
}