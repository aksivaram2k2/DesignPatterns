//http://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm
package DataAccessPatternDemo;
public class Student
{
	private String name;
	private int rollno;
	
	Student(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	
	public void setRollNo(int rollno)
	{
		this.rollno = rollno;
	}
}
