package NewJavaTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class CancoAdmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://admin.dev.cancopetroleum.ca/");
		driver.findElement(By.name("email")).sendKeys("rishi@x360digital.com");
		driver.findElement(By.name("password")).sendKeys("Rishi@2023");
		driver.findElement(By.xpath("//button [@type = 'submit']")).click();
		System.out.println("Logged In Successfully");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div [@class = 'style_commonDashboardPage__cgMvx']/div[5]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add Sub Admin']")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("Rishi");
		driver.findElement(By.name("last_name")).sendKeys("Saini Test User");
		driver.findElement(By.name("email")).sendKeys("rishi.sn97@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Rishi@2022");
		
		List<WebElement> access = driver.findElements(By.xpath("//span [@class='checkmark']"));
					
		for (WebElement checkbox : access) 
		{
			checkbox.click();
		}
            
		driver.findElement(By.xpath("//button [@type='submit']")).click();
		
		Thread.sleep(5000);		
		assert driver.findElement(By.xpath("//p [text()='rishisaini@gmail.com']")).isSelected() : "Not Available!";
		
		System.out.println("New User Created Successfully");
		
		// Need to check why the code is not stopping when error message is displayed.
		
			
	}

}
