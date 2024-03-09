import java.util.*;

public class App 
{
	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
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
