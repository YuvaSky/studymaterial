import java.util.*;

public class ProductRepository 
{
	public List<Product> list=new ArrayList<Product>();
	public void save(Product p)
	{
		list.add(p);
	}
	public void showList()
	{
		System.out.println("-----------------------------------");
		for(Product p:list)
		{
			System.out.println(p);
		}
		if(list.isEmpty())
			System.out.println("List is empty");
		System.out.println("-------------------------------------");
	}
}
