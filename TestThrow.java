
public class TestThrow 
{
	public void myThrow(int a) throws ArithmeticException
	{
		System.out.println("Inside myThrow");
		if(a==0)
		{
			throw new ArithmeticException();
		}
		
	}
}
