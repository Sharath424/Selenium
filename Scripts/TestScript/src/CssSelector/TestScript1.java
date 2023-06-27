package CssSelector;
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
		//locating password filed by using css selector- tagname & id_value
		WebElement password = driver.findElement(By.cssSelector("input#password_step_input"));
		//sending the keys to password
		password.sendKeys("Autom@tion");

	}

}
