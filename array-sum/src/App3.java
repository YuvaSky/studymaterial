public class App3 
{
	public static void main(String[] args) 
	{
		int [] x= {2,5,6};
		int [] y= {12,34,6,7,6};
		int [] z= {78,34,53,6,3,4};
		
		int res=App2.sum(x)+App2.sum(y)+App2.sum(z);
		System.out.println(res);
	}
}
