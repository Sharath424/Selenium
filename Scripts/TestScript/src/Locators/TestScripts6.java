package Locators;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScripts6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to Facebook page
		driver.get("https://www.facebook.com/");
		// locating the Create new account hyperlink
		WebElement link =driver.findElement(By.partialLinkText("Create new account"));
		// clicking the Create new account hyperlink
		link.click();
	
		Thread.sleep(3000);
		/* we use thread.sleep, because the execution speed of eclipse is 
		not matching with web page loading speed and we get 'no such element exception' */
		// locating the first name web element
		WebElement firstname = driver.findElement(By.name("firstname"));
		// sending values to first name web element
		firstname.sendKeys("lokesh");
		// locating the last name web element
		WebElement lastname = driver.findElement(By.name("lastname"));
		// sending values to last name web element
		lastname.sendKeys("kumar");
		// locating the mobile number web element
		WebElement mobilenumber = driver.findElement(By.name("reg_email__"));
		// sending values to mobile number web element
		mobilenumber.sendKeys("7899586482");
		// locating the password web element
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		// sending values to password web element
		password.sendKeys("Autom@tion");
		//locating the drop-down box and sending the corresponding values
		// using selectByIndex() method
		 WebElement day= driver.findElement(By.name("birthday_day"));
		Select sel1 = new Select(day);
		 sel1.selectByIndex(22);
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select sel2 = new Select(month);
		sel2.selectByIndex(2);
		WebElement year= driver.findElement(By.name("birthday_year"));
		 Select sel3 =new Select(year);
		sel3.selectByIndex(25);
		//22 for 2001 ,23 for 2000, 24 for 1990 using selectByValue () method
//		WebElement day= driver.findElement(By.name("birthday_day"));
//		Select sel1 =new Select(day);
//		
//		sel1.selectByValue("22");
//		WebElement month= driver.findElement(By.name("birthday_month"));
//		Select sel2 = new Select(month);
//		sel2.selectByValue("4");
//		WebElement year= driver.findElement(By.name("birthday_year"));
//		Select sel3 =new Select(year);
//		sel3.selectByValue("2002");
//	//	 using selectByVisibleText() method
//		WebElement day= driver.findElement(By.name("birthday_day"));
//		 Select sel1 =new Select(day);
//		 sel1.selectByVisibleText("29");
//		WebElement month= driver.findElement(By.name("birthday_month"));
//		Select sel2 = new Select(month);
//		sel2.selectByVisibleText("Sep");
//		WebElement year= driver.findElement(By.name("birthday_year"));
//		Select sel3 = new Select(year);
//		 sel3.selectByVisibleText("2000");
//		WebElement day= driver.findElement(By.name("birthday_day"));
//		day.sendKeys("29");
//		WebElement month= driver.findElement(By.name("birthday_month"));
//		month.sendKeys("september");
//		WebElement year= driver.findElement(By.name("birthday_year"));
//		year.sendKeys("2000");

	}

}
