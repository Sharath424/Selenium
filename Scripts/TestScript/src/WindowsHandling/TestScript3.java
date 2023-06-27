package WindowsHandling;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to my window web page
		driver.navigate().to("E:\\Automation\\Selenium\\HTML\\Index.html");
		//locating the hyper link
		WebElement link = driver.findElement(By.linkText("click here"));
		//clicking the link
		link.click();
		//locate the address of parent window
		String parent_window = driver.getWindowHandle();
		System.out.println("currently selenium is present in "+parent_window);
		//locating the address of both parent and child window
		Set<String> address = driver.getWindowHandles();
		System.out.println("address of both parent and child windows"+address);
		for (String i : address) {
		if(i.equals(parent_window)) {
			
		
		//do nothing!
			}
		else {
		driver.switchTo().window(i); 
		// locating the Create new account hyperlink
		WebElement links= driver.findElement(By.partialLinkText("Create new account"));
		// clicking the Create new account hyperlink
		links.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // we use thread.sleep, because the execution speed of eclipse is not matching with web page loading speed and we get 'no such element exception'
		// locating the first name web element
		WebElement firstname = driver.findElement(By.name("firstname"));
		// sending values to first name web element
		firstname.sendKeys("Lokesh");
		// locating the last name web element
		WebElement lastname = driver.findElement(By.name("lastname"));
		// sending values to last name web element
		lastname.sendKeys("Kumar");
		// locating the mobile number web element
		WebElement mobilenumber = driver.findElement(By.name("reg_email__"));
		// sending values to mobile number web element
		mobilenumber.sendKeys("7489561235");
		// locating the password web element
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		// sending values to password web element
		password.sendKeys("Autom@tion");
		// sending the values to drop down box using selectByVisibleText() method
		//sending values to day
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select sel1 =new Select(day);
		sel1.selectByVisibleText("05");
		//sending values to month
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select sel2 = new Select(month);
		sel2.selectByVisibleText("Nov");
		//sending values to year
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select sel3 = new Select(year);
		sel3.selectByVisibleText("1997"); }
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(parent_window);
		}
		}

}
