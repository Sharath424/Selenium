package Domstructure;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigating to google page
		driver.get("https://www.google.com/");
		//locating search bar in google page
		WebElement search = driver.findElement(By.name("q"));
		//sending the keys to search bar
		search.sendKeys("amazon");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//locating all the suggestions given by search bar using tagName locator
		List<WebElement> ele = driver.findElements(By.tagName("li"));
		//traversing the web element
		for (WebElement e : ele)
		{
		//printing all the suggestions on console
		System.out.println(e.getText());
		}

		
	}

}
