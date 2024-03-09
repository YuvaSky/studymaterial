import java.util.Scanner;

public class ProductService 
{
	Scanner sc=new Scanner(System.in);
	ProductRepository repo=new ProductRepository();
	public void saveProduct()
	{
		System.out.println("--------------------");
		System.out.print("Enter product id:");
		int v1=sc.nextInt();
		System.out.print("Enter product name:");
		sc.nextLine();
		String v2=sc.nextLine();
		System.out.print("Enter product brand:");
		String v3=sc.nextLine();
		System.out.print("Enter product price:");
		int v4=sc.nextInt();
		Product p=new Product(v1,v2,v3,v4);
		repo.save(p);
		System.out.println("--------------------------");
		System.out.println("Product data has been saved");
	}
	public void showProductList()
	{
		repo.showList();
	}
}
