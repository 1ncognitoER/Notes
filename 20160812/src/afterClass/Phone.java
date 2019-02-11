package afterClass;

public class Phone {

	private String brand;
	private int price;
	private String style;
	private String color;

	// 剩余量
	public int number;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumber() {
		return number;
	}

	// public void setNumber(int number) {
	// this.number = number;
	// }

	@Override
	public String toString() {
		return "Phone [brand=" + brand + "\t price=" + price + "\t style=" + style + "\t color=" + color + "\t number="
				+ number + "]";
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String brand, int price, String style, String color, int number) {
		super();
		this.brand = brand;
		this.price = price;
		this.style = style;
		this.color = color;
		this.number = number;
	}

}