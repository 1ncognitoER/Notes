package test_001;

import java.io.UnsupportedEncodingException;

public class ChangeCode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
//		String s = "字符串aaa111";
//		System.out.println(s);
		
//		String utf8 = new String(s.getBytes( "UTF-8"));// s.getBytes( "UTF-8")以UTF-8的编码取得字节
//		System.out.println("UTF-8:"+utf8);
////		String unicode = new String(utf8.getBytes(),"UTF-8");
////		System.out.println("UNICODE:"+unicode);
//		String unicode = new String(s.getBytes(),"UTF-8");
//		System.out.println("UNICODE:"+unicode);
//		String gbk = new String(utf8.getBytes("GBK"));
//		System.out.println("GBK:"+gbk);
		
		
//		String unicode = new String(s.getBytes("GBK"),"GBK");
//		System.out.println("UNICODE:"+unicode);
		
//		String gbk = new String(s.getBytes("GBK"));
//		System.out.println("GBK:"+gbk);
//		String utf8 = new String(gbk.getBytes("UTF-8"));
//		System.out.println(utf8);
//		String unicode = new String(s.getBytes("UTF-8"),"UTF-8");
//		System.out.println("UNICODE:"+unicode);
//		String utf8 = new String(gbk.getBytes("UTF-8"));
//		System.out.println("UTF-8:"+utf8);
		
		
		
		String gbkStr = "你好哦!"; //源码文件是GBK格式，或者这个字符串是从GBK文件中读取出来的, 转换为string 变成unicode格式
		//利用getBytes将unicode字符串转成UTF-8格式的字节数组
//		byte[] utf8Bytes = gbkStr.getBytes("UTF-8");
		//然后用utf-8 对这个字节数组解码成新的字符串
//		String utf8Str = new String(utf8Bytes, "UTF-8");
		String utf8Str = new String(gbkStr.getBytes("UTF-8"), "UTF-8");
		System.out.println(utf8Str);
	}

}
