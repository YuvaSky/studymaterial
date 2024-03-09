import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] numbers={10,40,900,60,1,67,589};
		System.out.print("Enter the number:");
		int x=sc.nextInt();
		//Searching value of variable x into array numbers
		int c=0;//variable c would be flag variable
		for(int i=0;i<numbers.length;i++)
		{
			if(x==numbers[i])
			{
				c=1;
				break;
			}
		}
		if(c==1)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}








