import java.util.Scanner;

public class App2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String [] list={"Amit","Rahul","Imran","Suman","David","Hemant","Jasmeet"};
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		int c=0;//variable c would be flag variable
		for(int i=0;i<list.length;i++)
		{
			if(name.equals(list[i]))
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








