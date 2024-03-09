import java.util.HashMap;

public class App 
{
	public static void main(String[] args) 
	{
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("amit","9919875298");
		map.put("rahul","8810436567");
		map.put("kapil","7388855117");
		map.put("amit","5566778899");
		
		//System.out.println(map);
		String phone=map.get("amit");
		System.out.println(phone);
	}
}
