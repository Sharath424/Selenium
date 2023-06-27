package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to zomato page
		driver.get("https://www.zomato.com/");
		driver.findElement(By.cssSelector("input.sc-1yzxt5f-9")).sendKeys("selenium@gmail.com");

	}

}
