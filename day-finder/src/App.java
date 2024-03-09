import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		//November 2022
		String [] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the date of this month:");
		int date=sc.nextInt();
		if(date<1 || date>30)
		{
			System.out.println("Invalid date");
			return;
		}
		System.out.println("Day is:"+days[date%7]);
	}
}
