package WindowsHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to my window web page
		driver.navigate().to("E:\\Automation\\Selenium\\HTML\\Index.html");
		//file:///E:/Automation/Selenium/HTML/Index.html
		//locating the hyper link
		WebElement link = driver.findElement(By.linkText("click here"));
		//clicking the link
		link.click();
		//locate the address of parent window
		String parent_window = driver.getWindowHandle();
		System.out.println("currently selenium is present in "+parent_window);
		//locate the address of child window
		String child_window = driver.getWindowHandle();
		System.out.println("currently selenium is present in "+child_window);

	}

}
