public class App7 
{
	public static void main(String[] args) 
	{
		int []x=new int[] {10,30,40,90,80};
		//code to add all numbers of the array x(using loop) and display sum
		int sum = x[0]; // initialize sum
	    for(int i=1; i<x.length; i++)
	    {
	            sum=sum+x[i];
	    }
	    System.out.println(sum);
	}
}
