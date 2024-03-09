public class Product 
{
	private int pid;//instance variable/field/data member/non-static variable
	private String name;
	private String brand;
	private int price;
	public Product() {}
	public Product(int pid, String name, String brand, int price) 
	{
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int p) {
		this.pid = p;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() 
	{
		return "Product [pid=" + pid + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
