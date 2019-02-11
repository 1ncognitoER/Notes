package inClass;

public class ZhanDuiTest {

	public static void main(String[] args) {
		
		ZhanDui zd = new ZhanDui();
		
		zd.addData("a");
		zd.addData("b");
		zd.addData("c");
		zd.addData("d");
		
		while(!zd.isEmpty()){
			System.out.println(zd.getData());
		}
		
	}

}
