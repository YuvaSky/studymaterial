public class App5 
{
	public static void main(String[] args) 
	{
		
		int []x=new int[] {10,30,40,90,80};
		//create a new array of same size(size and type of x) and type
		//copy values of array x into new array in reverse order
		int [] y=new int[x.length];
		y[0]=x[4];
		y[1]=x[3];
		y[2]=x[2];
		y[3]=x[1];
		y[4]=x[0];
		
	}
}
