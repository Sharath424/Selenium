package Scripts;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestScript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		//Navigating to KodNest web page
		driver.get("https://www.kodnest.com/");
	}

}
E:\Web-driver\chromedriver_win32