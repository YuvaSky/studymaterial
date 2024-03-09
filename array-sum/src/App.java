public class App 
{
	static void show(int [] y)
	{
		y[2]=100;
	}
	public static void main(String[] args) 
	{
		int [] x= {40,10,89,56,475};
		show(x);
		System.out.println(x[1]);
	}
}
