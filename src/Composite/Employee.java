//http://www.tutorialspoint.com/design_pattern/composite_pattern.htm
//Composite pattern is used where we need to treat a group of objects in similar way as a single object

package Composite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employee
{
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int sal)
	{
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee e)
	{
		subordinates.add(e);
	}
			
	public void remove(Employee e)
	{
		subordinates.remove(e);
	}
	
	public List<Employee> getSubordinates()
	{
		return subordinates;
	}
	
	public String toString()
	{
	      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
	}
}
