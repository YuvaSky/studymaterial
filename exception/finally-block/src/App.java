public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("Connection opened");
		int [] x= {10,20,30};
		int y=0;
		try
		{
			int res=x[5]/y;
			System.out.println(res);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Divide by zero");
		}
		finally
		{
			System.out.println("Connection closed");
		}
	}
}
