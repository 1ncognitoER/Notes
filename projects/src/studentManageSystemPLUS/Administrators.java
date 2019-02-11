package studentManageSystemPLUS;

public class Administrators {
	private String a_account;
	private String a_password;
	
	public Administrators(String a_account, String a_password) {
		super();
		this.a_account = a_account;
		this.a_password = a_password;
	}

	public Administrators() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Administrators [a_account=" + a_account + ", a_password=" + a_password + "]";
	}

	public String getA_account() {
		return a_account;
	}

	public void setA_account(String a_account) {
		this.a_account = a_account;
	}

	public String getA_password() {
		return a_password;
	}

	public void setA_password(String a_password) {
		this.a_password = a_password;
	}
	
}
