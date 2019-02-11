package org.serviceImpl;

import java.util.List;

import org.dao.StudentDao;
import org.service.StudentService;

import bean.Student;

public class StudentServiceImpl implements StudentService {
	/*属性*/
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	/*方法*/
	@Override
	public Student selectStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			studentDao.insertStudent(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
