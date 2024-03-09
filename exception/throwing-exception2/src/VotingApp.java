public class VotingApp 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution begins...");
		try
		{
			Voter obj=new Voter("Rahul",16);
		}
		catch(VoterAgeException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution ends...");
	}
}
