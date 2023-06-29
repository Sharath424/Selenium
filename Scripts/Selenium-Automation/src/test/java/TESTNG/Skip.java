package TESTNG;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip {

	@Test
	public void add() {
	int a=12;
	int b=45;
	int c=a+b;
	System.out.println(c);
	throw new SkipException("Still under development");
	}
	@Test
	public void sub() {
	int a=12;
	int b=45;
	int c=a-b;
	System.out.println(c);
	}
	}


