public class App 
{
	public static void main(String[] args) 
	{
		Car hondacar1=new Car(new DieselEngine());
		Car hondacar2=new Car(new PetrolEngine());
		
		hondacar1.turnEngineOn();
		hondacar2.turnEngineOn();
	}
}
