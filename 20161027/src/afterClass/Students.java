package afterClass;

import java.io.Serializable;

public class Students implements Serializable {
	private long idNumber;
	private String name;
	private int age;
	private String remarks;
	protected Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected Students(long idNumber, String name, int age, String remarks) {
		super();
		this.idNumber = idNumber;
		this.name = name;
		this.age = age;
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Students [idNumber=" + idNumber + ", name=" + name + ", age=" + age + ", remarks=" + remarks + "]";
	}
	public long getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
