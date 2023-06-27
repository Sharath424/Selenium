package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to google web page
		driver.get("https://google.com/");
		//locating Gmail hyperlink/hypertext
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		//creating the object for Actions class
		Actions act = new Actions(driver);
		//performing hover effect
		act.moveToElement(gmail).build().perform();

	}

}
