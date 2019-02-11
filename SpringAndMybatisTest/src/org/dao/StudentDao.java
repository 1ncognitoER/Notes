package org.dao;

import java.util.List;

import org.bean.Student;

public interface StudentDao {
	public Student selectStudent(int studentId);

	public List<Student> selectAllStudents();

	public void deleteStudent(int studentId);

	public void insertStudent(Student student) throws Exception;

	public void updateStudent(Student student);
}
