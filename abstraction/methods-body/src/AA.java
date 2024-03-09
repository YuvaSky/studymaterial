public interface AA 
{
	void method1();
	static void method2()
	{
		System.out.println("Body");
	}
	default void method3()
	{
		System.out.println("Body");
	}
}
