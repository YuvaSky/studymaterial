public class App 
{
	public static void main(String[] args) 
	{
		int [] num= {50,20,8,61,256,78};
		
		//This loop will reverse array value
		for(int i=0,j=num.length-1;i<=j;i++,j--)
		{
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
		}
		//This loop will display array value
		for(int n:num)
		{
			System.out.println(n);
		}
	}
}
