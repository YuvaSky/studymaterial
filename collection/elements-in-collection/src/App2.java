import java.util.*;

public class App2 
{
	public static void main(String[] args) 
	{
		Set<String> list=new HashSet<String>();
		list.add("Rahul");
		list.add("Amit");
		list.add("Kuldeep");
		list.add(null);
		list.add("David");
		list.add("Imran");
		list.add("David");
		list.add(null);
		
		for(String str:list)
		{
			System.out.println(str);
		}
	}
}
