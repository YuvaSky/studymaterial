public class App2 
{
	static int [] num=new int[3];
	static int i=-1; 
	static void add(int n)
	{
		if(i==num.length-1)
			grow();
		num[++i]=n;
	}
	static void grow()
	{
		System.out.println("Array size changed");
		int [] arr=new int[num.length*2];
		for(int c=0;c<=i;c++)
		{
			arr[c]=num[c];
		}
		num=arr;
	}
	static void show()
	{
		for(int c=0;c<=i;c++)
			System.out.print(num[c]+",");
	}
	public static void main(String[] args) 
	{
		System.out.println(num.length);
		add(80);add(20);add(40);add(12);
		System.out.println(num.length);
		show();
	}
}
