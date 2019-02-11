package studentManageSystem;

public class Students {
	private long userNumber;// 学号 以后用来作为遍历序号
	private String passWord;

	private String name;
	private String sex;
	private String phoneNumber;
	private String address;
	private int age;
	private long QQNumber;

	/* 构造方法 */
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(long userNumber, String passWord, String name, String sex, String phoneNumber, String address,
			int age, long qQNumber) {
		super();
		this.userNumber = userNumber;
		this.passWord = passWord;
		this.name = name;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.age = age;
		QQNumber = qQNumber;
	}

	@Override
	public String toString() {
		return "Students [userNumber=" + userNumber + ", passWord=" + passWord + ", name=" + name + ", sex=" + sex
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", age=" + age + ", QQNumber=" + QQNumber
				+ "]";
	}

	/* 对外接口 */
	public long getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(long userNumber) {
		this.userNumber = userNumber;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getQQNumber() {
		return QQNumber;
	}

	public void setQQNumber(long qQNumber) {
		QQNumber = qQNumber;
	}

}
