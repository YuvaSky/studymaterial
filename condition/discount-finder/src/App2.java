public class App2 
{
	public static void main(String[] args) 
	{
		int amount=1000;
		if(amount<2500)
		{
			System.out.println("Sorry you are not eligible for discount");
			System.out.println("Payable amount is:"+amount);
			return;//It will terminate execution of current method
		}
		//code to find discount
		double discount=0.0;
		if(amount>=10000)
		{
			discount=amount*.20;
		}
		else
		{
			if(amount>=7000)
			{
				discount=amount*.15;
			}
			else
			{
				if(amount>=4500)
				{
					discount=amount*.10;
				}
				else
				{
					if(amount>=2500)
					{
						discount=amount*.05;
					}
				}
			}
		}//end of first else
		System.out.println("Total discount is:"+discount);
		double pa=amount-discount;
		System.out.println("Payable amount is:"+pa);
	}
}
