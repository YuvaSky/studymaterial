import java.util.Scanner;

public class App2 
{
	public static void main(String[] args) 
	{
		//Any month of year 2022
		String [] days= {"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
		int [] nod= {31,28,31,30,31,30,31,31,30,31,30};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month of this year:");
		int month=sc.nextInt();
		System.out.print("Enter the date of this month:");
		int date=sc.nextInt();
		for(int i=0;i<month-1;i++)
		{
			date+=nod[i];
		}
		System.out.println("Day is:"+days[date%7]);
	}
}
