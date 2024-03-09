import java.util.LinkedList;

public class App 
{
	public static void main(String[] args) 
	{
		//LinkedList<String> list=new LinkedList<String>();
		MyLinkedList list=new MyLinkedList();
		list.add("Rahul");
		list.add("Ravi");
		list.add("Kapil");
		list.add("Suman");
		list.add(3,"Rohan");
		list.removeFirst();
		list.removeFirst();
		list.showList();
		//System.out.println(list);
	}

}
