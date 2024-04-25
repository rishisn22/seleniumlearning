package NewJavaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_basics {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  //This will invoke WebDriver methods + Class methods
		
		driver.get("https://www.google.com/");
		
		
	}

}
