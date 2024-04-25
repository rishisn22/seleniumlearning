package NewJavaTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class miscellaneousWebDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// ChromeOptions options = new ChromeOptions();
		// options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		//WebDriver driver = new ChromeDriver(options);
		
		// driver.get("https://expired.badssl.com/");
		// System.out.println(driver.getTitle());
		
		
		//Takes Screenshot
		
		File  src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Rishi\\Desktop\\New folder\\Screenshot.png"));
		
				
	}

}
