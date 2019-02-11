package test;

import java.util.Scanner;

public class Case2 {

	/**
	 * @author Blood Moon
	 * 		使用split方法，将一首诗分割出来xxxxxxxx，将"蓦然" 替换成 "麻木"
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String str1 = "东风夜放花千树，,更吹落 星如雨。,宝马雕车香满路，,凤箫声动，,玉壶光转，,一夜鱼龙舞。,蛾儿雪柳黄金缕，,笑语盈盈暗香去。,众里寻他千百度，,蓦然回首，,那人却在灯火阑珊处! ";
		
		/**
		 *
		 * 增强for循环格式
		 * for(数据类型 [后面数组/集合的]元素：数组/集合){}
		 */
		for (String element : str1.replace("��Ȼ", "ľȻ").split(",")) {
			System.out.println(element);
		}
		
		
	}

}
