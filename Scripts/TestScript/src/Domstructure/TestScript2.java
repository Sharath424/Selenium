package Domstructure;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to my instagram page
		driver.get("https://www.instagram.com//");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//locating the phone number box and sending keys using, attribute approach of 	relative xpath
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("7845612569");
		

	}

}
