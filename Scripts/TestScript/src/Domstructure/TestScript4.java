package Domstructure;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to my instagram page
		driver.get("https://www.instagram.com//");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//locating the password field and sending keys using starts-with() approach of relative xpath
		driver.findElement(By.xpath("//input[starts-with(@name,'password')]")).sendKeys("783445678");
	}

}
