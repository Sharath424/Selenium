package TESTNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Afterandbefore {

	@BeforeMethod
	public void login_Test()
	{
	System.out.println("Login Completed");
	}
	@Test
	public void compose_Test()
	{
	System.out.println("composing of mail Completed");
	}
	@Test
	public void sendmail_Test()
	{
	System.out.println("sending of mail is Completed");
	}
	@AfterMethod
	public void logout_Test()
	{
	System.out.println("logout is Completed");
	}

	
}
