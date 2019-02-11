package studentManageSystem;

public class Person {

	private String name;
	private String sex;
	private String phoneNumber;
	private String address;
	private int age;
	private long QQNumber;

	/* 构造方法 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String sex, String phoneNumber, String address, int age, long QQNumber) {
		super();
		this.name = name;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.age = age;
		this.QQNumber = QQNumber;
	}

	/* 对外接口 */
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