package afterClass;

import java.util.Scanner;

public class Rent {
	private String carNumber;
	private String carType;
	private String carColor;
	private int rental;
	private int deadWeight;
	
	static Scanner in = new Scanner(System.in);
	
	private int calcu(int rentDay){
		return rentDay*getRental();
	}
	public void rentInf(){
		System.out.println("请输入租车人的姓名：");
		String name= in.next();
		System.out.println("请输入租车天数：");
		int rentDay= in.nextInt();
		
		int endRent = calcu(rentDay);
		show(name,endRent);
		
	}
	private void show(String name,int endRent){
		System.out.println("车牌号："+getCarNumber());
		System.out.println("车型："+getCarType());
		System.out.println("颜色："+getCarColor());
		System.out.println("载重量(kg)："+getDeadWeight());
		System.out.println("租车人姓名："+name);
		System.out.println("应付金额："+endRent);
	}
	public Rent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rent(String carNumber, String carType, String carColor, int rental, int deadWeight) {
		super();
		this.carNumber = carNumber;
		this.carType = carType;
		this.carColor = carColor;
		this.rental = rental;
		this.deadWeight = deadWeight;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getRental() {
		return rental;
	}
	public void setRental(int rental) {
		this.rental = rental;
	}
	public int getDeadWeight() {
		return deadWeight;
	}
	public void setDeadWeight(int deadWeight) {
		this.deadWeight = deadWeight;
	}
	
}
