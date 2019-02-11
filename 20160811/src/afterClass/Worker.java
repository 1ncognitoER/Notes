package afterClass;

public class Worker {
	private String name;
	private int age;
	private double salary;

	public Worker() {
	}

	public Worker(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void work() {
		System.out.println(name + "\twork");
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + "\tage=" + age + "\tsalary=" + salary + "]";
	}

	@Override
	public int hashCode() {

		// int number = 57;
		// int result = 1;
		// result = number * name.hashCode() * age * (int)salary;
		// return result;

		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		// if(((Worker)obj).getName().equals(this.name)){
		// if(((Worker)obj).getAge()==this.age){
		// if(((Worker)obj).getSalary()==this.salary){
		// return true;
		// }else{
		// return false;
		// }
		// }else{
		// return false;
		// }
		// }else{
		// return false;
		// }

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

}
