public class App 
{
	static void show(int [] y)
	{
		y[0]=500;
	}
	public static void main(String[] args) 
	{
		int [] x = {10,20,30,40,50};
		show(x);
		System.out.println(x[0]);

	}
}
