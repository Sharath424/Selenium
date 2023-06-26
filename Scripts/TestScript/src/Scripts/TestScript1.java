package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		//Navigating to amazon web page
		driver.get("https://www.amazon.com/");
	}

}
