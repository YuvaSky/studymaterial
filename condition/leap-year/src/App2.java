public class App2 
{
	public static void main(String[] args) 
	{
		int x=1,y=1,z=1;
		boolean res=++x<10 && (++y>10 || ++z<10);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
