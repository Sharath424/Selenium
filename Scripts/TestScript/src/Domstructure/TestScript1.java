package Domstructure;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestScript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// navigating to my web page
		driver.get("E:\\Automation\\Selenium\\HTML\\Index3.html");
		//locate and click on my link using attribute approach of relative xpath
//		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		//locate and on click options present in select box by using text () approach of relative xpath
//		driver.findElement(By.xpath("//option[text()='automation testing']")).click();
//		//locate and on click options present in select box by using contains () approach of relative xpath
//		driver.findElement(By.xpath("//option[contains(text(),'m')]")).click();
//		//locate and click on list three using starts-with approach of relative xpath
		driver.findElement(By.xpath("//li[starts-with(@value,'th')]")).click();
		//locate and click on my link using AND approach of relative xpath
//		driver.findElement(By.xpath("//a[@target='_blank' and @id='anchor']")).click();
		//locate and click on my link using OR approach of relative xpath
//		driver.findElement(By.xpath("//a[@target='_blank' or @id='ancho']")).click();
		//locate and click on my link using axes method of relative xpath to locate parent tag approach
//		driver.findElement(By.xpath("//a[@target='_blank']//parent::td")).click();
		//locate and click on list three using axes method of relative xpath to locate child tag approach
//		driver.findElement(By.xpath("//ul[@id='number']//child::li[3]")).click();
		//locate and click on my link using axes method of relative xpath to locate ancestor tag approach
//		driver.findElement(By.xpath("//a[@target='_blank']//ancestor::table")).click();
		//locating the following siblings of 'two' in my web page using axes method of relative xpath to locate following-sibling tag approach 
//		driver.findElement(By.xpath("//li[@value='two']//following-sibling::li[2]")).click();
		//locate and click on my link using axes method of relative xpath to locate following tag approach 
//		driver.findElement(By.xpath("//div[@id='div2']//following::a")).click();

	}

}
