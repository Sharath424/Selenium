package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestScripts6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to yatra page
		driver.get("https://www.yatra.com/");
		//locating and clicking on student fare checkbox by using css selectorstartswith
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[title^='Student']")).click();
		//locating and clicking on hotel using css selector-endswith
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a[id$='hotels']")).click();
		//locating and clicking on holidays using css selector-contains
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a[id*='holidays']")).click();

	}

}
