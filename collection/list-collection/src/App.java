import java.util.ArrayList;

public class App 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"Amit Singh","Sales",45000));
		list.add(new Employee(104,"Amit Singh","Sales",45000));
		list.add(new Employee(102,"Amit Singh","Sales",45000));
		list.add(new Employee(103,"Amit Singh","Sales",45000));
		list.add(new Employee(105,"Amit Singh","Sales",45000));
		
		for(int i=0;i<list.size();i++)
		{
			Employee emp=list.get(i);
			System.out.println(emp);
		}
	}
}
