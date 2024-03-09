public class Product 
{
	private String name;
	private String brand;
	private int quantity;
	private double price;
	private boolean isAvailable;
		
	public void showProduct()
	{
		System.out.println("Name:"+name);
		System.out.println("Brand:"+brand);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
		System.out.println("Availalbe:"+isAvailable);
	}
}
