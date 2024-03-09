import java.util.*;

public class App4 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(111,"Rahul Mishra");
		map.put(25,"Hemant Maurya");
		map.put(276,"Imran Ahmad");
		map.put(19,"Suman Singh");
		
		Collection<String> c=map.values();
		System.out.println(c);
		
	}
}
