package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.bean.Student;
import org.springframework.jdbc.datasource.DataSourceUtils;

public class DaoImpl {
	/*Dao层属性*/
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	/*Dao方法*/
	public void insertStudent(Student student) throws Exception{
		Connection conn = DataSourceUtils.getConnection(dataSource);
		PreparedStatement pstmt = conn.prepareStatement("insert into student values(?,?,1,'女','noremark',1)");
		pstmt.setInt(1, student.getStudentId());
		pstmt.setString(2, student.getStudentName());
		pstmt.execute();
	}
}
