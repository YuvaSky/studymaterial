public class MyInteger 
{
	private Integer num;
	public MyInteger(Integer num)
	{
		this.num=num;
	}
	public int hashCode()
	{
		System.out.println("Hashcode method called");
		return num.hashCode();
	}
	public boolean equals(Object obj)
	{
		System.out.println("Equals method called");
		MyInteger mi=(MyInteger)obj;
		return this.num==mi.num;
	}
}
