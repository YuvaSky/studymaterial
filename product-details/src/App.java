import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		int [] pid= {101,102,103,104,105};
		String [] name= {"Mouse","Mobile","Keyboard","Laptop","Printer"};
		String [] brand= {"Logitech","Samsung","HP","Acer","HP"};
		int [] price= {1200,34000,1800,56000,5000};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter product id:");
		int id=sc.nextInt();
		int c=-1;
		for(int i=0;i<pid.length;i++)
		{
			if(id==pid[i])
			{
				c=i;
				break;
			}
		}
		if(c==-1)
			System.out.println("Given product id does not exist");
		else
		{
			System.out.println("----------------------------");
			System.out.println("Product name:"+name[c]);
			System.out.println("Product brand:"+brand[c]);
			System.out.println("Product price:"+price[c]);
			System.out.println("----------------------------");
		}
	}
}
