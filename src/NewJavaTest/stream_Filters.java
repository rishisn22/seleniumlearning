package NewJavaTest;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stream_Filters {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> veggiesElement = driver.findElements(By.xpath("//tr/td[1]")); 
		
		List<WebElement> veggies =  veggiesElement.stream().filter(s->s.getText().contentEquals("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggies.size(), veggiesElement.size());
	}

}
