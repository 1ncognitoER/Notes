package afterClass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "java Java JAVa JaVa IloveJAVA you heteJava afasdfasdf";
		test(string);
	}
	
	public static void test(String string) {
		String [] strArr = string.split(" ");
		for(int i = 0; i < strArr.length; i++) {
			
			String temp = strArr[i].toLowerCase();
			
			int start = temp.indexOf("java");
			int end = start + 4;
			
			if(start != -1) {//包含
				if((i+1)%2 == 1) {//奇数位
					strArr[i] = strArr[i].replace(strArr[i].substring(start, end), "java");
				} else {
					strArr[i] = strArr[i].replace(strArr[i].substring(start, end), "JAVA");
				}
			}
			System.out.println(strArr[i]);
		}
		
	}

}
