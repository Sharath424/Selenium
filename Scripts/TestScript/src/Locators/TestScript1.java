package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) {

//launching the browser
		ChromeDriver driver = new ChromeDriver();
//maximize the window
		driver.manage().window().maximize();
//navigating to google page
		driver.get("https://www.google.com/");
//locating gmail hyperlink/hypertext
		WebElement link = driver.findElement(By.linkText("Gmail"));
//clicking on hyperlink
		link.click();

	}

}
