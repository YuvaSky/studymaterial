public class AA 
{
	public AA()
	{
		System.out.println("Non-parameterized constructor");
	}
	public AA(int x)
	{
		System.out.println("Parameterized constructor");
	}
	public static void main(String[] args) 
	{
		new AA();
		new AA(10);
	}
}
