public class App4 
{
	public static void main(String[] args) 
	{
		
		int []x=new int[] {10,30,40,90,80};
		//create a new array of same size(size and type of x) and type
		//copy values of array x into new array
		int [] y=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			y[i]=x[i];
		}
	}
}
