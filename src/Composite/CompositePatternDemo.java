package Composite;
public class CompositePatternDemo 
{
	public static void main(String args[])
	{
		Employee CEO = new Employee("JOHN", "CEO", 300000);
		Employee HeadSales = new Employee("Richard", "Head Sales", 150000);
		Employee HeadOperations = new Employee("Alex", "Head Operations", 150000);
		
		CEO.add(HeadSales);
		CEO.add(HeadOperations);
		
		Employee SalexExec1 = new Employee("Jade", "Senior Sales Exec", 50000);
		Employee SalexExec2 = new Employee("Steve", "Junior Sales Exec", 30000);
		
		HeadSales.add(SalexExec1);
		HeadSales.add(SalexExec2);
		
		Employee OpexExec1 = new Employee("Mathew", "Senior Opex Exec", 50000);
		Employee OpexExec2 = new Employee("Allen", "Junior Opex Exec", 30000);
		
		HeadOperations.add(OpexExec1);
		HeadOperations.add(OpexExec2);
		
		System.out.println(CEO);
		
		for(Employee headEmployee : CEO.getSubordinates())
		{
			System.out.println(headEmployee);
		}
		
		for(Employee headEmployee : HeadOperations.getSubordinates())
		{
			System.out.println(headEmployee);
		}
		
		for(Employee headEmployee : HeadSales.getSubordinates())
		{
			System.out.println(headEmployee);
		}
		
	}
}