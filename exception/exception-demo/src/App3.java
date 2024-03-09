import java.io.*;

public class App3 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		//This code will load file in memory to read from it
		try
		{
			FileReader fr=new FileReader("aa.txt");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Specifie file does not exist");
		}
		System.out.println("Execution ends");
	}
}
