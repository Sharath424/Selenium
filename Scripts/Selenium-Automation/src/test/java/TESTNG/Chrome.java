package TESTNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Chrome {
	@Test
	public void compare() 
	{
	//launching the browser
	WebDriver driver = new ChromeDriver();
	//maximize the window 
	driver.manage().window().maximize();
	//storing the expected title
	String expected_title="Google";
	//navigating to google page 
	driver.navigate().to("https://www.google.com");
	//getting the actual title
	String actual_title=driver.getTitle();
	//comparing expected title and actual title
	Assert.assertEquals(actual_title, expected_title);
	}
	}


