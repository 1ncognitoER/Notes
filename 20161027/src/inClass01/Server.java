package inClass01;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * @throws Exception
	 * 
	 *             网络编程测试->发送数据
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 创建基于服务端的socket套接字
		ServerSocket serverSocket = new ServerSocket(9999);// 8888是端口
		Socket socket = serverSocket.accept();
		// 输出流对象
		OutputStream outputStream = socket.getOutputStream();
		String s = "qwertyuiiopasdfghjklzxcvbnm";
		outputStream.write(s.getBytes());
		// outputStream.flush();
		outputStream.close();

	}
}