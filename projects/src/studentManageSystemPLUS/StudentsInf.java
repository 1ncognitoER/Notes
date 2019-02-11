package studentManageSystemPLUS;

public class StudentsInf {
	private int s_account;
	private String s_password;
	private String name;
	private String sex;
	private int age;
	private String s_classid;
	private String s_classname;
	private String s_classcontent;
	
	public StudentsInf(int s_account, String s_password, String name, String sex, int age, String s_classid,
			String s_classname, String s_classcontent) {
		super();
		this.s_account = s_account;
		this.s_password = s_password;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.s_classid = s_classid;
		this.s_classname = s_classname;
		this.s_classcontent = s_classcontent;
	}
	public StudentsInf(int s_account, String s_password, String name, String sex, int age, String s_classid) {
		super();
		this.s_account = s_account;
		this.s_password = s_password;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.s_classid = s_classid;
	}
	public StudentsInf(String s_password, String name) {
		super();
		this.s_password = s_password;
		this.name = name;
	}
	public StudentsInf() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "s_account=" + s_account + "\ts_password=" + s_password + "\tname=" + name + "\tsex=" + sex
				+ "\tage=" + age + "\ts_classid=" + s_classid + "\ts_classname=" + s_classname + "\ts_classcontent="
				+ s_classcontent;
	}
	/**
	 * 用于学生查询
	 * @param si
	 * @return
	 */
	public String toStringPlus(){
		return "s_account=" + s_account + "\ts_password=" + s_password + "\tname=" + name + "\tsex=" + sex
				+ "\tage=" + age + "\ts_classid=" + s_classid;
	}
	
	public int getS_account() {
		return s_account;
	}
	public void setS_account(int s_account) {
		this.s_account = s_account;
	}
	public String getS_password() {
		return s_password;
	}
	public void setS_password(String s_password) {
		this.s_password = s_password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getS_classid() {
		return s_classid;
	}
	public void setS_classid(String s_classid) {
		this.s_classid = s_classid;
	}
	public String getS_classname() {
		return s_classname;
	}
	public void setS_classname(String s_classname) {
		this.s_classname = s_classname;
	}
	public String getS_classcontent() {
		return s_classcontent;
	}
	public void setS_classcontent(String s_classcontent) {
		this.s_classcontent = s_classcontent;
	}
	
}
