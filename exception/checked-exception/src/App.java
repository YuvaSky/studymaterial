import java.io.*;
public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		try
		{
			FileReader fr=new FileReader("aa.txt");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution ends");
	}
}
