package MouseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to google web page
		driver.get("https://google.com/");
		// locating the search box
		WebElement search = driver.findElement(By.name("q"));
		//creating the object of Actions class
		Actions act = new Actions(driver);
		//to type amazon in upper case
		act.keyDown(Keys.SHIFT).build().perform();
		search.sendKeys("amazon");
		//to type .com in lower case
		act.keyUp(Keys.SHIFT).build().perform();
		search.sendKeys(".com");
		
		//act.keyDown(Keys.SHIFT).sendKeys("amazon").keyUp(Keys.SHIFT).sendKeys(".com").build().perform();

	}

}
