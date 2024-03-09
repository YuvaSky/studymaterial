public class Car 
{
	private FourWheelerEngine engine;
	
	public Car(FourWheelerEngine engine)
	{
		this.engine=engine;
	}
	public void turnEngineOn()
	{
		engine.startEngine();
	}
	public void turnEngineOff()
	{
		engine.stopEngine();
	}
}
