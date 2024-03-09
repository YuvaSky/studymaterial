public class Voter 
{
	private String name;
	private int age;
	public Voter(String name, int age)throws VoterAgeException 
	{
		this.name = name;
		this.age = age;
		if(this.age<18)
		{
			VoterAgeException exception=new VoterAgeException(this.age+" is not valid age for voter");
			throw exception;
		}
	}
	
}
