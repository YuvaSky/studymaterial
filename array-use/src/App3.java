import java.util.Scanner;

public class App3 
{
	public static void main(String[] args) 
	{
		int [] num= {100,400,190,12,10,90,345,12,6778,12,565,344};
		//code to display smallest number,largest number,average number
		int min=num[0];
		int max=num[0];
		int sum=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]<min)
				min=num[i];
			if(num[i]>max)
				max=num[i];
			sum=sum+num[i];
		}
		System.out.println("Smallest number is:"+min);
		System.out.println("Largetst number is:"+max);
		System.out.println("Average number is:"+(float)sum/num.length);
	}
}
