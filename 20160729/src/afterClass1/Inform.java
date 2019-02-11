package afterClass1;

public class Inform {
	private String num;
	private String name;
	private int count;
	private int price;
//	private String type;
	private Type types= new Type();//public Type types;这样并不会创建一个Types对象
	
	
	public Inform(String num, String name, int count, int price, String tName,String tNumber) {
		super();
		this.num = num;
		this.name = name;
		this.count = count;
		this.price = price;
		this.types.settName(tName);
		this.types.settNumber(tNumber);
//		this.type=types.gettName();
	}

	public Inform() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void show(){
		System.out.println("商品名称："+this.name);
		System.out.println("商品编号："+this.num);
		System.out.println("商品类别名称："+this.types.gettName());
		System.out.println("商品类别编号："+this.types.gettNumber());
		System.out.println("商品库存："+this.count);
		System.out.println("商品单价(元)："+this.price);
		System.out.println("商品总价："+(this.price*this.count));
		System.out.println("------------------------------------");
	}

}
