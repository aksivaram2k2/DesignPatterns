package DataAccessPatternDemo;
import java.util.ArrayList;
import java.util.List;
public class StudentDaoImpl implements StudentDao
{
	List<Student> students;
	
	public StudentDaoImpl()
	{
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 1);
		Student student2 = new Student("John", 2);
		students.add(student1);
		students.add(student2);
		
		@Override
		public void deleteStudent(Student student)
		{
			students.remove(student.getRollno());
			System.out.println("Removed from DB");
		}
		
		@Override
		public void updateStudent(Student student);
		{
			student.get
		}
		
		
	}
}