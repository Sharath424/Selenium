package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestScript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to my web page
		driver.get("E:\\Automation\\Selenium\\HTML\\Index2.html");
		//locating and clicking on link1 by using absolute xpath.
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[1]/a")).click();
		//locating and clicking on link1 by using relative xpath
		driver.findElement(By.xpath("//div[1]//td[1]//a")).click();
		//locating and clicking on link4 by using relative xpath.
		driver.findElement(By.xpath("//div[2]//td[2]//a")).click();
		//locating and clicking on link4 by using absolute xpath.
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/a")).click();

		
	}

}
