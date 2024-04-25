package NewJavaTest;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stream_Table {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on columnheader to sort the column
		driver.findElement(By.xpath("//th [@role='columnheader'][1]")).click();
		
		//Grab the data from table, sort it and then print it.
		
		//Store all the web elements from the table into list.
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Collect the web elements into list and convert them into string.
		List<String> originallist = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort the List using the java streams.
		List<String> sortedlist =  originallist.stream().sorted().collect(Collectors.toList());
		
		//sortedlist.stream().forEach(s->System.out.println(s));
		
		Assert.assertEquals(originallist, sortedlist);
		
		
		///// HOW TO HANDLE PAGINATION -> If required value is not present in the first page.
		List<String> price;
		
		do {
			//This will refresh and store the elements again when we move to next page.
			List<WebElement> elementlistpage = driver.findElements(By.xpath("//tr/td[1]")); 
					
			//From the elementlist, filter the veggies based on text and collect in the List. getPriceVeggie method is called to get price of veggie
		price = elementlistpage.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.stream().forEach(a->System.out.println(a));
		
				
		if(price.size()<1) 
		{
			driver.findElement(By.xpath("//a [@aria-label = 'Next']")).click();
			
		}
		}while(price.size()<1);
		
			
		
	}

	//Method to get price of veggies
	private static String getPriceVeggie(WebElement s) {
	 String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
		
	}

}
