package jdbcTest;

public class Student {
	private int account;
	private String name;
	private String classid;
	@Override
	public String toString() {
		return "Student [account=" + account + ", name=" + name + ", classid=" + classid + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int account, String name, String classid) {
		super();
		this.account = account;
		this.name = name;
		this.classid = classid;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	
}
