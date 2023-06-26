package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript5 {

	public static void main(String[] args) {
		//launching the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigating to facebook page
		driver.get("https://www.facebook.com/");
		//locating the email box
		WebElement email = driver.findElement(By.name("email"));
		//locating the password box
		WebElement password = driver.findElement(By.name("pass"));
		//sending the keys to email box
		email.sendKeys("selenium@gmail.com");
		//sending the keys to password box
		password.sendKeys("automation");

	}

}
