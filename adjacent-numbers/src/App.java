public class App 
{
	public static void main(String[] args) 
	{
		int [] num= {100,45,23,563,64,4454,23,35456,41232};
		int n=num.length-1;
		if(num[0]>num[1])
		{
		  System.out.println(num[0]);
		}
		for(int i=1;i<n;i++)
		{
		  if(num[i]>num[i-1] && num[i]>num[i+1])
		  {
			  System.out.println(num[i]);
		  }
		}
		if(num[n]>num[n-1])
		{
			System.out.println(num[n]);
		}
	}
}
