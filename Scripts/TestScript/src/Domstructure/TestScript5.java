package Domstructure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to Facebook page
		driver.get("https://www.facebook.com/");
		// locating the Create new account hyperlink
		WebElement link = driver.findElement(By.partialLinkText("Create new account"));
		// clicking the Create new account hyperlink
		link.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//locate and click on my link using axes method of relative xpath to locate child tag .
		driver.findElement(By.xpath("//select[@id='day']//child::option[23]")).click();
		driver.findElement(By.xpath("//select[@id='month']//child::option[12]")).click();
		driver.findElement(By.xpath("//select[@id='year']//child::option[97]")).click();

	}

}
