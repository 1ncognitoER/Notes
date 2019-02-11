package inClass01;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	/**
	 * @param args
	 * 
	 *            网络编程测试->接收数据
	 * @throws IOException
	 * @throws UnknownHostException
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 通过IP地址和端口号,创建一个Socket对象
		Socket socket = new Socket("127.0.0.1", 9999);
		// 建立输入数据流
		InputStream is = socket.getInputStream();
		byte[] b = new byte[10];
		int len = 0;

		StringBuffer sb = new StringBuffer();
		while ((len = is.read(b)) != -1) {
			sb.append(new String(b, 0, len));
		}
		System.out.println(sb.toString());
	}

}