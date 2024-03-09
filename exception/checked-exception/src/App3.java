import java.io.*;
public class App3 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		try
		{
			FileReader fr=new FileReader("aaa.txt");//load specified file in memory
			BufferedReader br=new BufferedReader(fr);
			String str=br.readLine();//read data from file line by line
			while(str!=null)
			{
				System.out.println(str);
				str=br.readLine();
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution ends");
	}
}
