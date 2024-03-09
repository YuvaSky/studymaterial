public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		int [] x= {10,20,30};
		int y=0;
		try
		{
			int res=x[2]/y;
			System.out.println(res);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array index is out od range");
		}
		System.out.println("Execution ends");
	}
}
