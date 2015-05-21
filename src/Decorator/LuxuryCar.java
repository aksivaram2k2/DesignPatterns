package Decorator;
public class LuxuryCar extends CarDecorator
{
	public LuxuryCar(Car c)
	{
		super(c);
	}
	
	public void assemble()
	{
		car.assemble();
		System.out.println("After features in Luxury Car");
	}
}