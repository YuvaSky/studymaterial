public class App 
{
	public static void main(String[] args) 
	{
		int amount=21000;
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
