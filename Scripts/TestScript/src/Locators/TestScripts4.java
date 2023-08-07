package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScripts4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigating to google page
		driver.get("https://www.google.com/");
		//locating search bar web element
		WebElement search = driver.findElement(By.name("q"));
        //	Or 
		//WebElement search = driver.findElement(By.className("gLFyf"));
		//to send the keys
		search.sendKeys("git.com");
		
	}

}
