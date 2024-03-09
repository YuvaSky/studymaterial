public class Account 
{
	private String name;//instance variable
	private int amount; //instance variable
	public Account(String  a1,int a2) //constructor
	{
		name=a1; //assign
		amount=a2;//assign
	}
	public void showBalance()//method
	{
		System.out.println("+--------------------------------+");
		System.out.println("Dear "+name);
		System.out.println("Your current balance is:"+amount);
		System.out.println("+--------------------------------+");
	}
}



