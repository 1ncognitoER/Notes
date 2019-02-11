package bean;

import java.util.List;

public class Clzss {
	private int clzssId;
	private String clzssName;
	private String clzssContent;
	private List<Student> studentList;
	@Override
	public String toString() {
		return "Clzss [clzssId=" + clzssId + ", clzssName=" + clzssName + ", clzssContent=" + clzssContent
				+ ", studentList=" + studentList + "]";
	}
	public Clzss(int clzssId, String clzssName, String clzssContent, List<Student> studentList) {
		super();
		this.clzssId = clzssId;
		this.clzssName = clzssName;
		this.clzssContent = clzssContent;
		this.studentList = studentList;
	}
	public Clzss() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClzssId() {
		return clzssId;
	}
	public void setClzssId(int clzssId) {
		this.clzssId = clzssId;
	}
	public String getClzssName() {
		return clzssName;
	}
	public void setClzssName(String clzssName) {
		this.clzssName = clzssName;
	}
	public String getClzssContent() {
		return clzssContent;
	}
	public void setClzssContent(String clzssContent) {
		this.clzssContent = clzssContent;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}
