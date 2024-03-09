import java.util.*;

public class App 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Rohit");
		list.add("Ravi");
		list.add("Hemant");
		list.addFirst("Kapil");
		list.addLast("Suman");
		list.add("Imran");
		list.add(0,"Kuldeep");
		System.out.println(list);
	}
}
