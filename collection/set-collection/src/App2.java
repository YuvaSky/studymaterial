import java.util.*;
public class App2 
{
	public static void main(String[] args) 
	{
		HashSet<MyInteger> set=new HashSet<MyInteger>();
		set.add(new MyInteger(16));
		set.add(new MyInteger(32));
		set.add(new MyInteger(16));
		set.add(new MyInteger(10));
		set.add(new MyInteger(32));
	}
}
