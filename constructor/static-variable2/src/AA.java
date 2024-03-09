public class AA 
{
	int x; //instance variable/non-static variable
	static int y;//class variable/static variable
	
	public static void main(String[] args) 
	{
		AA o1=new AA();
		AA o2=new AA();
		AA o3=new AA();
		o1.x=10;
		o2.x=60;
		o3.x=5;
		System.out.println(o1.x+o2.x+o3.x);
		o1.y=10;
		o2.y=60;
		o3.y=5;
		System.out.println(o1.y+o2.y+o3.y);
	}
}
