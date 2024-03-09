import java.util.HashMap;

public class App2 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		map.put(111,"Rahul Mishra");
		map.put(25,"Hemant Maurya");
		map.put(276,"Imran Ahmad");
		map.put(19,"Suman Singh");
		
		//map.remove(25);
		if(map.containsKey(215))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		if(map.containsValue("Rahul Mishra"))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
	}
}
