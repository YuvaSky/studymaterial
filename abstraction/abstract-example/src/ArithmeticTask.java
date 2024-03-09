import java.util.Scanner;

public abstract class ArithmeticTask 
{
	protected int num1;
	protected int num2;
	protected int res;
	
	protected void acceptNumbers()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		num1=sc.nextInt();
		System.out.print("Enter second number:");
		num2=sc.nextInt();
	}
	protected abstract void performTask();
	protected void showResult()
	{
		System.out.println();
	}
}
