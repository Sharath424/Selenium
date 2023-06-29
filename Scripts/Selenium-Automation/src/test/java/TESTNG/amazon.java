package TESTNG;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {

	@Test
	public void demo()
	{
	//launching the browser
	WebDriver driver = new ChromeDriver();
	//maximizing the window
	driver.manage().window().maximize();
	//navigating to amazon page
	driver.get("https://www.amazon.in/");
	//locating search bar and sending keys and clicking enter
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("City of Djins: year in Delhi", Keys.ENTER);
	//locating and clicking on the book
	
	driver.findElement(By.cssSelector("img[src='https://m.media-amazon.com/images/I/51u8SeCRi1L._AC_UY218_.jpg']")).click();
	
	//driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t3.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div > div.sg-col.sg-col-4-of-12.sg-col-4-of-16.sg-col-4-of-20.sg-col-4-of-24.s-list-col-left > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.puis-image-overlay-grey.s-padding-left-small.s-padding-right-small.s-flex-expand-height.puis.puis-v132n5e4faosf42v0eo3rf7vw9m > div > span > a > div > img")).click();
	//getting the address of parent window
	
	
	String parent = driver.getWindowHandle();
	//applying implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// Getting the address of parent and child window
	Set<String> address = driver.getWindowHandles();
	// Switching to the child window
	for (String e : address)
	{
	if(!e.equalsIgnoreCase(parent))
	{
	driver.switchTo().window(e);
	}
	}
	//locating and clicking on buy now button
	driver.findElement(By.name("submit.buy-now")).click();
	//locating and sending keys to password
	driver.findElement(By.name("email")).sendKeys("8970145866",Keys.ENTER);
	//locating password and sending keys
	driver.findElement(By.id("ap_password")).sendKeys("Autom@tion",Keys.ENTER);
	
	}

}
