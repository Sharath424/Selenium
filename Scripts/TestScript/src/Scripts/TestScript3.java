package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript3 {

	public static void main(String[] args) {
			//launching the browser
			ChromeDriver driver = new ChromeDriver();
			//maximizing the window
			driver.manage().window().maximize();
			//Navigating to google web page
			driver.get("https://www.google.com/");
			//getting the actual title of google page
			String ActualTitle=driver.getTitle();
			System.out.println("Title of google page is "+ ActualTitle);
			String ExpectedTitle="Google";
			//comparing actual title with expected title
			if(ActualTitle.equals(ExpectedTitle))
			{
			System.out.println("Title is matching");
			}
			else
			{
			System.out.println("Title is not matching");
			}
			
			
	}

}
