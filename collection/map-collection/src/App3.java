import java.util.*;

public class App3 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(111,"Rahul Mishra");
		map.put(25,"Hemant Maurya");
		map.put(276,"Imran Ahmad");
		map.put(19,"Suman Singh");
		
		Set<Integer> set=map.keySet();
		System.out.println(set);
		
	}
}
