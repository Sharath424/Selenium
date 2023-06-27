
package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript5 {

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
		//locating first name using css selector -tagname and any attribute
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Lokesh");
		//locating surname using css selector- substring contains *
		driver.findElement(By.cssSelector("input[name*='lastname']")).sendKeys("Kumar");
		//locating email using css selector- substring startswith ^
		driver.findElement(By.cssSelector("input[name^='reg_email__']")).sendKeys 
		("selenium190@gmail.com");
		//locating reconfirm email using substring- endswith $
		driver.findElement(By.cssSelector("input[name$='confirmation__']")).sendKeys 
		("selenium190@gmail.com");
		//locating password filed by using css selector-tagname ,id_value and any attribute
		driver.findElement(By.cssSelector("input#password_step_input[name='reg_passwd__']")).sendKeys("12345678");

	}

}