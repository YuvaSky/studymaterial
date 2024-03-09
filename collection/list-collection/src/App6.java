import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class App6 
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
		
		list.remove(list.get(2));
		list.remove(0);
		
		for(Employee emp:list)
			System.out.println(emp);
	}
}
