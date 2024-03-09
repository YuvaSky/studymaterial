import java.util.Scanner;

public class App2 
{
	public static void main(String[] args) 
	{
		int [] num= {10,400,190,12,10,90,345,12,6778,12,565,344};
		//Code to find frequency of the accepted number
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(n==num[i])
			{
				count++;
			}
		}
		if(count==0)
			System.out.println("Given number does not exist");
		else
			System.out.println("Frequency of "+n+" is:"+count);
	}
}
