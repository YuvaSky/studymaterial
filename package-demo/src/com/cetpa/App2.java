package com.cetpa;
public class App2 
{
	public int sum(int [] y)
	{
		int sum=y[0];
		for(int i=1;i<y.length;i++)
		{
			sum=sum+y[i];
		}
		return sum;
	}
}
