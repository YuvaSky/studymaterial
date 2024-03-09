import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		ProductService service=new ProductService();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("--------------------");
			System.out.println("1:Save product data");
			System.out.println("2:Display product list");
			System.out.println("3:Delete product data");
			System.out.println("4:Search product");
			System.out.println("5:Exit");
			System.out.println("---------------------");
			System.out.print("Enter your choice:");
			int ch=sc.nextInt();
			if(ch==1)//save
			{
				service.saveProduct();
			}
			else if(ch==2)
			{
				service.showProductList();
			}
			else if(ch==5)
			{
				System.out.println("Thank you...");
				break;
			}
		}
		while(true);
	}
}
