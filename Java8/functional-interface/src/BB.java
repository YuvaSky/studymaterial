@FunctionalInterface
public interface BB 
{
	void method1();
	//void method2();
	static void method2()
	{
		System.out.println("Welcome");
	}
	default void method3()
	{
		System.out.println("Ok");
	}
}
