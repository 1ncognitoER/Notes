package inClass;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * SQL注入攻击实例
 * 
 * @author Blood Moon
 *
 */
public class DataBaseTest01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//篡改输入信息,原Jobs表中的job_id没有改数据
		String inData = "aba' or '1'='1";
//		String inData = "AD_VP";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url= "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String user = "hr";
		String passWord = "000000";
		Connection conn = DriverManager.getConnection(url, user, passWord);
		/**
		 * SQL注入攻击：
		 * sql语句和inData数据结合起来如下：
		 * select * jobs where job_id='aba' or '1'='1';
		 */
//		Statement stat = conn.createStatement();
//		ResultSet rs = stat.executeQuery("select * from jobs where job_id='"+inData+"'");
		/**
		 * SQL注入攻击解决方案：
		 * 采用PreparedStatement预编译机制
		 * 
		 */
		PreparedStatement pstmt = conn.prepareStatement("select * from jobs where job_id=?");
		pstmt.setString(1, inData);//1表示上一句问号的下标（注：？的下标是从1开始的）
//		pstmt.setString(0, inData);//测试代码
		ResultSet rs = pstmt.executeQuery();
		
		List<Jobs> li = new ArrayList<Jobs>();
		while(rs.next()){
			Jobs J= new Jobs(rs.getString(1));
			li.add(J);
		}
		if(li.size()>0){
			System.out.println("登录成功！");
		}else{
			System.out.println("登录失败！");
		}
		
	}

}
