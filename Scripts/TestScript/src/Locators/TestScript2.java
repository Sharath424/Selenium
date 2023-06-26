package Locators;


import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigating to facebook page
		driver.get("https://www.facebook.com/");
		//locating contact uploading and non-users using partialLinkText locator
		WebElement link =driver.findElement(By.partialLinkText("uploading"));
		//locating contact uploading and non-users using LinkText locator
		WebElement links = driver.findElement(By.linkText("Contact uploading and non-users"));
		//to fetch all the hyper links
		List<WebElement> list_links= driver.findElements(By.tagName("a"));
		//display the count of all the hyperlinks in list
		System.out.println(list_links.size());
		//clicking on hyperlink
		link.click();

	}

}
