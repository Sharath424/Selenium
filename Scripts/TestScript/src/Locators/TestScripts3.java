package Locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScripts3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launching the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window 
		driver.manage().window().maximize();
		//navigating to facebook page
		driver.get("https://www.facebook.com/");
		 //locating contact uploading and non-users using partialLinkText locator
		WebElement link = driver.findElement(By.partialLinkText ("uploading"));
		//locating contact uploading and non-users using linkText locator
		//WebElement links = driver.findElement(By.linkText("Contact uploading and non-users"));
		//to fetch all the hyper links
		List<WebElement> list_links= driver.findElements(By.tagName("a"));
		//display the count of all the hyperlinks in list
		System.out.println(list_links.size());
		//Traversing through the list by using traditional for loop and getting the elements on the console
		/* for (int i=0; i<list_links.size();i++) {
		System.out.println(list_links.get(i).getText()); } */
		//Traversing through the list by using for each loop/advanced for loop/enhanced for loop and getting the elements on the console
		for (WebElement e: list_links) {
		System.out.println(e.getText());
		}
		//clicking on hyperlink
		link.click();

	}

}
