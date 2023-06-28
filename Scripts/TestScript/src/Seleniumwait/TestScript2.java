package Seleniumwait;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScript2 {

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
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		// locating the first name web element
		WebElement firstname = driver.findElement(By.name("firstname"));
		// sending values to first name web element
		firstname.sendKeys("lokesh");

	}

}
