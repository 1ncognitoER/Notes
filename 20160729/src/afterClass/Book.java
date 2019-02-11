package afterClass;

public class Book {
	
	private String bName;
	private String bAuthor;
	private String bPublisher;
	private int bPrice=10;
	
	public void show(){
		System.out.println("书名："+bName);
		System.out.println("作者："+bAuthor);
		System.out.println("出版社："+bPublisher);
		System.out.println("单价（元）："+bPrice);
		System.out.println("---------------------------------");
	}
	
	public Book(String bName, String bAuthor, String bPublisher, int bPrice) {
		super();
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bPublisher = bPublisher;
		if(bPrice>10){
			this.bPrice = bPrice;
		}else{
			System.out.println("价格初始化错误，以设为默认值10元！");
		}
	}
	public String getbPublisher() {
		return bPublisher;
	}
	public void setbPublisher(String bPublisher) {
		this.bPublisher = bPublisher;
	}
	public int getbPrice() {
		return bPrice;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
	public String getbName() {
		return bName;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	
	
}
