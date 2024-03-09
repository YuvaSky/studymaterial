public class App 
{
	public static void main(String[] args) 
	{
		String str1=new String("Rehan");
		String str2=new String("Rohan");
		
		MyString str3=new MyString("Rehan");
		MyString str4=new MyString("Rohan");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
