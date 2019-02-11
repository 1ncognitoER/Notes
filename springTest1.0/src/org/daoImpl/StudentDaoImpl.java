package org.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.dao.StudentDao;
import org.springframework.jdbc.datasource.DataSourceUtils;

import bean.Student;

public class StudentDaoImpl implements StudentDao {
	/*Dao层属性*/
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	/*Dao方法*/
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
	public void insertStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DataSourceUtils.getConnection(dataSource);
		PreparedStatement pstmt = conn.prepareStatement("insert into student values(?,?,?,?,?,?)");
		pstmt.setInt(1, student.getStudentId());
		pstmt.setString(2, student.getStudentName());
		pstmt.setInt(3, student.getStudentAge());
		pstmt.setString(4, student.getStudentSex()+"");
		pstmt.setString(5, student.getStudentContent());
		pstmt.setInt(6, student.getClzssId());
		pstmt.execute();
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
}
