package MouseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to jquery web page
		driver.get("https://jqueryui.com/droppable/");
		//locating the iframe
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		//switch to iframe box
		driver.switchTo().frame(iframe);
		//locating drag box
		WebElement dragbox = driver.findElement(By.id("draggable"));
		//locating drop box
		WebElement dropbox = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		//perform click and hold, moveToElement , release action.
		act.clickAndHold(dragbox).moveToElement(dropbox).release().build().perform();

	}

}
