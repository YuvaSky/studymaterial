public class App2 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=0;
		System.out.println("Execution begins");
		try
		{
			int res1=num1/num2;
			System.out.println("Result1:"+res1);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Divide by 0 is not possible");
		}
		int res2=num1+num2;
		System.out.println("Result1:"+res2);
		int res3=num1*num2;
		System.out.println("Result1:"+res3);
		System.out.println("Execution ends");
	}
}
