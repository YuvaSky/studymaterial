public class App 
{
	public static void main(String[] args) 
	{
		int [] num= {10,400,190,12,10,90,345,1264,6778,34,565,344};
		//Code to display all 2-digits numbers
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>=10 && num[i]<=99)
			{
				System.out.println(num[i]);
			}
		}
	}
}
