public class Triangle extends Shape 
{
	private int base;
	private int height;
	
	public Triangle(int base, int height) 
	{
		this.base = base;
		this.height = height;
	}
	public void findShapeArea()
	{
		double area=base*height*.5;
		System.out.println("Area of triangle is "+area);
	}
}
