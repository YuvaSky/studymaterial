import java.util.*;
public class App4 
{
	public static void main(String[] args) 
	{
		HashSet<String> set=new LinkedHashSet<String>();
		set.add("Rahul");
		set.add("Amit");
		set.add("Ravi");
		set.add("Rahul");
		set.add("Kapil");
		set.add(null);
		set.add("Imran");
		set.add(null);
		System.out.println(set);
	}
}
