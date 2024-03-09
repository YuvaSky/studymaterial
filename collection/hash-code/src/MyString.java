public class MyString 
{
	private String str;
	public MyString(String str)
	{
		this.str=str;
	}
	public int hashCode()
	{
		return 123*str.hashCode();
	}
	public String toString()
	{
		return str;
	}
}
