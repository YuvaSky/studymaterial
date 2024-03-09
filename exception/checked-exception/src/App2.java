import java.io.*;
public class App2 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		try
		{
			FileReader fr=new FileReader("aa.txt");//load specified file in memory
			BufferedReader br=new BufferedReader(fr);
			String str=br.readLine();//read data from file line by line
			while(str!=null)
			{
				System.out.println(str);
				str=br.readLine();
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("enters into file not found exception catch");
			System.out.println(ex);
		}
		catch(IOException ex)
		{
			System.out.println("enters into io exception catch");
			System.out.println(ex);
		}
		System.out.println("Execution ends");
	}
}
