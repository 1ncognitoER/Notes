package inClass;

public class Jobs {
	private String job_id;
	private String job_title;
	private int min_salary;
	private int max_salary;
	public Jobs(String job_id, String job_title, int min_salary, int max_salary) {
		super();
		this.job_id = job_id;
		this.job_title = job_title;
		this.min_salary = min_salary;
		this.max_salary = max_salary;
	}
	public Jobs(String job_id) {
		super();
		this.job_id = job_id;
	}
	@Override
	public String toString() {
		return "Jobs [job_id=" + job_id + ", job_title=" + job_title + ", min_salary=" + min_salary + ", max_salary="
				+ max_salary + "]";
	}
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
