package inClass2;

public class Test {
	public static void main(String[] args) {
//		Lion l = new Lion();
//		l.type="狮子";
//		l.color="棕色";
//		l.sex="雄性";
//		l.shiXing="肉食";
//		System.out.println(l);
		Lion ll = new Lion("狮子","棕色","雌性","肉食");
		System.out.println(ll);
		
		ll.show();
		ll.show1();
	}
}
