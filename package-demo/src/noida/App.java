package noida;

import com.cetpa.App2;

public class App 
{
	public static void main(String[] args) 
	{
		int [] x= {2,5,6};
		int [] y= {12,34,6,7,6};
		int [] z= {78,34,53,6,3,4,56,343};
		
		App2 obj=new App2();
		
		//int res=App2.sum(x)+App2.sum(y)+App2.sum(z);
		int res=obj.sum(x)+obj.sum(y)+obj.sum(z);
		System.out.println(res);
	}
}
