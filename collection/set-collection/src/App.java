import java.util.*;
public class App 
{
	public static void main(String[] args) 
	{
		HashSet<String> set=new HashSet<String>();
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
