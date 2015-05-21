package Decorator;
import Decorator.BasicCar;
import Decorator.CarDecorator;
import Decorator.LuxuryCar;
import Decorator.SportsCar;

public class PatternTest
{
	public static void main(String args[])
	{
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*******************");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
		
	}
}
