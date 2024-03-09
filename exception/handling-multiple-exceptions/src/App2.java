public class App2 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		int [] x= {10,20,30};
		int y=0;
		try
		{
			int res=x[6]/y;
			System.out.println(res);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution ends");
	}
}
