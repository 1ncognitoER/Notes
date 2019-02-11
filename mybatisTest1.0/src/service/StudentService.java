package service;

import java.util.List;

import bean.Student;

public interface StudentService {
	public Student selectStudent(int studentId);

	public List<Student> selectAllStudents();

	public void deleteStudent(int studentId);

	public void insertStudent(Student student);

	public void updateStudent(Student student);
}
