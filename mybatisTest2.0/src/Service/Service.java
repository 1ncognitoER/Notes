package Service;

import java.util.List;

import bean.Clzss;
import bean.Student;

public interface Service {
	/*处理student业务*/
	public Student selectStudent(int studentId);

	public List<Student> selectAllStudents();

	public void deleteStudent(int studentId);

	public void insertStudent(Student student);

	public void updateStudent(Student student);
	/*处理clzss业务*/
	public List<Clzss> selectAllClzss();
	
	public Clzss selectClzssById(int clzssId);
	
	public void deleteClzssById(int clzssId);
	
	public void insertClzss(Clzss clzss);
	
	public void updateClzss(Clzss clzss);
}
