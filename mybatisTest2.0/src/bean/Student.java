package bean;

public class Student {
	private int studentId;
	private String studentName;
	private int studentAge;
	private char studentSex;
	private String studentContent;
	private int clzssId;
	// 学生类中持有班级的对象
	private Clzss clzss;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentSex=" + studentSex + ", studentContent=" + studentContent + ", clzssId=" + clzssId
				+ ", clzss=" + clzss + "]";
	}

	public Student(int studentId, String studentName, int studentAge, char studentSex, String studentContent,
			int clzssId, Clzss clzss) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentSex = studentSex;
		this.studentContent = studentContent;
		this.clzssId = clzssId;
		this.clzss = clzss;
	}
	
	public Student(int studentId, String studentName, int studentAge, char studentSex, String studentContent,
			int clzssId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentSex = studentSex;
		this.studentContent = studentContent;
		this.clzssId = clzssId;
	}
	public Student(int studentId, String studentName, int studentAge, char studentSex, String studentContent) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentSex = studentSex;
		this.studentContent = studentContent;
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
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public char getStudentSex() {
		return studentSex;
	}
	public void setStudentSex(char studentSex) {
		this.studentSex = studentSex;
	}
	public String getStudentContent() {
		return studentContent;
	}
	public void setStudentContent(String studentContent) {
		this.studentContent = studentContent;
	}
	public int getClzssId() {
		return clzssId;
	}
	public void setClzssId(int clzssId) {
		this.clzssId = clzssId;
	}

	public Clzss getClzss() {
		return clzss;
	}

	public void setClzss(Clzss clzss) {
		this.clzss = clzss;
	}
}
