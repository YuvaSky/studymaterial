import java.util.Scanner;

public class Account 
{
	private String name;//instance variable
	private int amount; //instance variable
	public Account(String  a1,int a2) //constructor
	{
		name=a1; //assign
		amount=a2;//assign
	}
	public void showBalance()
	{
		System.out.println("+--------------------------------+");
		System.out.println("Dear "+name+" your current balance is:"+amount);
		System.out.println("+--------------------------------+");
	}
	public void depositMoney()
	{
		System.out.println("+--------------------------------+");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount value:");
		int x=sc.nextInt();
		amount=amount+x;
		System.out.println("Dear "+name+" amount "+x+" credited into your account");
		System.out.println("+--------------------------------+");
	}
}



