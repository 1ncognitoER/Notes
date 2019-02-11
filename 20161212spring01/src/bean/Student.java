package bean;

public class Student {
	private int studentId;
	private String studentName;
	private Clzss clzss;
	
	public Clzss getClzss() {
		return clzss;
	}
	public void setClzss(Clzss clzss) {
		this.clzss = clzss;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", clzss=" + clzss + "]";
	}
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
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
}
