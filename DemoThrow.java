
public class DemoThrow 
{
	public static void main(String[] args)
	{
		try
		{
			TestThrow t=new TestThrow();
			t.myThrow(10);
		}
		catch(ArithmeticException e)
		{	
			System.out.println("caught exception");
		}
		finally
		{
			System.out.println("finally block");
		}
		
	}
}
