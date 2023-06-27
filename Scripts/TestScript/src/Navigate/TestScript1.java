package Navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestScript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to zomato web page using navigate().to() method
		driver.navigate().to("https://zomato.com/");
		///locate add restaurant
		WebElement restaurant = driver.findElement(By.partialLinkText("Add restaurant"));
		//click on add restaurant
		restaurant.click();
		//navigate back
		driver.navigate().back();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //navigate forward
		driver.navigate().forward();
		//navigate refresh
		driver.navigate().refresh();

	}

}
