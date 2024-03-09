import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class App5 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"Amit Singh","Sales",45000));
		list.add(new Employee(106,"Amit Singh","Sales",45000));
		list.add(new Employee(103,"Amit Singh","Sales",45000));
		list.add(new Employee(105,"Amit Singh","Sales",45000));
		list.add(new Employee(102,"Amit Singh","Sales",45000));
		list.add(new Employee(104,"Amit Singh","Sales",45000));
		
		/*ListIterator<Employee> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		ListIterator<Employee> itr=list.listIterator(list.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
