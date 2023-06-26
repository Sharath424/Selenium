package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launching the browser
		ChromeDriver driver = new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		//Navigating to flipkart web page
		driver.get("https://www.flipkart.com/");
		//getting the title of flipkart page
		String title=driver.getTitle();
		System.out.println("Title of flipkart page is:"+title);
		//minimizing the window
		driver.manage().window().minimize();
		//full screen the window
		driver.manage().window().fullscreen();
		//Current Url of web page
		System.out.println("the current url is:"+driver.getCurrentUrl());
		//close the window
		driver.close();
		
		
	}

}
