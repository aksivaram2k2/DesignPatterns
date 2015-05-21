package Decorator;
public class SportsCar extends CarDecorator
{
	public SportsCar(Car c)
	{
		super(c);
	}
	
	public void assemble()
	{
		car.assemble();
		System.out.println("Adding features to Sports Car");
	}
}

