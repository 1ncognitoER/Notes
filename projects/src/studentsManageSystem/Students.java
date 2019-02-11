package studentsManageSystem;

import java.io.Serializable;

public class Students implements Serializable {
	private long IDNumber;
	private String passWord;
	private String name;
	private int age;
	private String phoneNumber;
	private int score;
	/**
	 * 构造器
	 * @param iDNumber
	 * @param passWord
	 * @param name
	 * @param age
	 * @param phoneNumber
	 * @param score
	 */
	protected Students(long iDNumber, String passWord, String name, int age, String phoneNumber, int score) {
		super();
		IDNumber = iDNumber;
		this.passWord = passWord;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.score = score;
	}
	protected Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	//toString方法
	@Override
	public String toString() {
		return "Students [IDNumber=" + IDNumber + ", passWord=" + passWord + ", name=" + name + ", age=" + age
				+ ", phoneNumber=" + phoneNumber + ", score=" + score + "]";
	}
	/**
	 * 对外接口
	 * @return
	 */
	public long getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(long iDNumber) {
		IDNumber = iDNumber;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
