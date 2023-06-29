package TESTNG;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class yatri {
	@Test
	public void demo()
	{
	//launch the browser
	WebDriver driver = new ChromeDriver();
	//maximize the window
	driver.manage().window().maximize();
	//navigate to yatra page
	driver.get("https://www.yatra.com/");
	//locating and clicking on 1 Travellers(s) ,class
	WebElement a = driver.findElement(By.className("txt-ellipses"));
	//printing the text on the console
	System.out.println(a.getText());
	a.click();
	// Set implicit wait to 10 seconds
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//clicking 5 times on the adult section
	for (int i = 0; i < 4; i++)
	{
	//locating and performing click action on the adult section
	driver.findElement(By.className("ddSpinnerPlus")).click();
	}
	//locating and clicking on 5 Travellers(s) ,class
	WebElement c = driver.findElement(By.className("txt-ellipses"));
	//printing the text on the console
	System.out.println(c.getText());
	//storing the actual url
	String actualURL="https://www.yatra.com/";
	//storing the current url
	String currentURL= driver.getCurrentUrl();
	//printing the actual url
	System.out.println(actualURL);
	//printing the current url
	System.out.println(currentURL);
	// Compare actualURL and currentURL using assertions
	Assert.assertEquals(actualURL, currentURL);
	//close the browser
	driver.close();
	}
	}


