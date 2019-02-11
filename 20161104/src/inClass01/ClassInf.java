package inClass01;

public class ClassInf {
	private int classID;
	private String className;
	public ClassInf(int classID, String className) {
		super();
		this.classID = classID;
		this.className = className;
	}
	public ClassInf(String className) {
		super();
		this.className = className;
	}
	public ClassInf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClassId() {
		return classID;
	}
	public void setClassId(int classID) {
		this.classID = classID;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "ClassInf [classID=" + classID + ", className=" + className + "]";
	}
	
}
