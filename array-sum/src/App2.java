public class App2 
{
	static int sum(int [] y)
	{
		int sum=y[0];
		for(int i=1;i<y.length;i++)
		{
			sum=sum+y[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int [] arr1= {1,2,3,4,5,6};
		int [] arr2= {10,20,30};
		
		//int s1=App2.sum(arr1);
		//int s2=App2.sum(arr2);
		int res=App2.sum(arr1)+sum(arr2);
		System.out.println(res);
	}
}
