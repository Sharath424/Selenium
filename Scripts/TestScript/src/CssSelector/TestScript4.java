package CssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to zomato page
		driver.get("https://www.zomato.com/");
		//locating phone number radio button using css selector- tagname and any attribute
		driver.findElement(By.cssSelector("circle[value='mobile']")).click();
		//locating and sending keys to phone number text box using css selector-taganme ,class_value and any attribute
		driver.findElement(By.cssSelector("input.sc-60vv3c-0[class='sc-60vv3c-0 fyGVHZ scfvLVrH eLNIdd']")).sendKeys("7338439554");
		

	}

}
