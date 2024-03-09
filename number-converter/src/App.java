import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		String [] x={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String [] y={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(num>=1 && num<=19)
		{
			System.out.print(x[num]+" ");
		}
		if(num>=20 && num<=99)
		{
			System.out.print(y[num/10]+" "+x[num%10]);
		}
	}

}
