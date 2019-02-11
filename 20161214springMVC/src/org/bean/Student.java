package org.bean;

import java.util.Date;

public class Student {
	private int studentId;
	private String studentName;
	private String studentContent;
	private Date studentDate;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentContent=" + studentContent
				+ ", studentDate=" + studentDate + "]";
	}
	public Student(int studentId, String studentName, String studentContent, Date studentDate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentContent = studentContent;
		this.studentDate = studentDate;
	}
	/*public Student(int studentId, String studentName, String studentContent) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentContent = studentContent;
	}*/
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentContent() {
		return studentContent;
	}
	public void setStudentContent(String studentContent) {
		this.studentContent = studentContent;
	}
	public Date getStudentDate() {
		return studentDate;
	}
	public void setStudentDate(Date studentDate) {
		this.studentDate = studentDate;
	}
}
