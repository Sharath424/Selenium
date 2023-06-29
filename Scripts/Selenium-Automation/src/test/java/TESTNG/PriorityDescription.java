package TESTNG;

import org.testng.annotations.Test;

public class PriorityDescription {

	@Test(priority = 1)
	public void add()
	{
	System.out.println("Addition is "+(10+20));
	}
	@Test(priority = 2)
	public void sub()
	{
	System.out.println("Subtraction is "+(10-20));
	}
	@Test(priority = 3,description = "The mul method should be passed kindly check ")
	public void mul()
	{
	System.out.println("Multiplication is "+(10*20));
	}
	@Test(priority = 4)
	public void div()
	{
	System.out.println("Division is "+(20/10));
	}
	

}
