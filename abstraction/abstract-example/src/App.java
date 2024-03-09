public class App 
{
	public static void main(String[] args) 
	{
		ArithmeticTask task=new Multiplication();
		task.acceptNumbers();
		task.performTask();
		task.showResult();
	}
}
