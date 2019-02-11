package studentManageSystemPLUS;

import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {

	JLabel jlOne, jlTwo, jlTitle;
	JTextField jtfOne, jtfTwo;
	JButton jbOne, jbTwo, jbThree, subJBOne, subJBTwo, subJBThree, subJBFour;
	JTextArea jTextA;

	/**
	 * 创建主窗体
	 * 
	 * @return
	 */
	public JFrame makeSupWindow() {
		/* 主窗体 */
		JFrame jf = new JFrame("Student Manager System");
		jf.setLayout(null);
		jf.setBounds(0, 0, 500, 300);
		jf.setLocationRelativeTo(null);// 居中显示
		/* 设置背景图片 */
		String location = "E:\\Eclipse\\projects\\src\\studentManageSystemPLUS\\files\\bg_pic.jpg";
		ImageIcon img = new ImageIcon(location);
		JLabel imgLabel = new JLabel(img);// 将背景图放在标签里。
		// 设置背景标签的位置
		// imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		imgLabel.setBounds(0, 0, jf.getWidth(), jf.getHeight());
		// 将背景标签添加到jfram的LayeredPane面板里。
		jf.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
		Container cp = jf.getContentPane();
		cp.setLayout(null); // 这里选择绝对布局管理器，对于边界布局管理器，放入控件后，无法显示背景图片；因为将整个面板都填充满了；
		((JPanel) cp).setOpaque(false);
		/* 组件 */
		// 标题
		jlTitle = new JLabel("学生管理系统");
		jlTitle.setBounds(160, 30, 200, 35);
		jlTitle.setFont(new Font("宋体", Font.BOLD, 25));
		// 输入框one
		jlOne = new JLabel("账号");
		jlOne.setBounds(60, 90, 40, 35);
		jlOne.setFont(new Font("宋体", Font.BOLD, 18));
		jtfOne = new JTextField("请输入账号");
		jtfOne.setBounds(110, 90, 300, 35);
		// 输入框two
		jlTwo = new JLabel("密码");
		jlTwo.setBounds(60, 140, 40, 35);
		jlTwo.setFont(new Font("宋体", Font.BOLD, 18));
		jtfTwo = new JTextField("请输入密码");
		jtfTwo.setBounds(110, 140, 300, 35);
		// 按钮
		jbOne = new JButton("管理员登录");
		jbOne.setBounds(60, 190, 100, 35);
		jbTwo = new JButton("学生登录");
		jbTwo.setBounds(185, 190, 100, 35);
		jbThree = new JButton("学生注册");
		jbThree.setBounds(310, 190, 100, 35);
		// 加载组件
		jf.add(jlTitle);
		jf.add(jtfOne);
		jf.add(jlOne);
		jf.add(jtfTwo);
		jf.add(jlTwo);
		jf.add(jbOne);
		jf.add(jbTwo);
		jf.add(jbThree);
		return jf;
	}

	/**
	 * 创建子窗体
	 * 
	 * @return
	 */
	public JFrame makeSubWindow() {
		JFrame jfSub = new JFrame("welcom!administrators");
		jfSub.setLayout(null);
		jfSub.setBounds(0, 0, 750, 350);
		// 居中显示
		jfSub.setLocationRelativeTo(null);
		// 添加按钮
		subJBOne = new JButton("查询");
		subJBOne.setBounds(10, 30, 100, 40);
		subJBTwo = new JButton("添加");
		subJBTwo.setBounds(10, 100, 100, 40);
		subJBThree = new JButton("修改");
		subJBThree.setBounds(10, 170, 100, 40);
		subJBFour = new JButton("删除");
		subJBFour.setBounds(10, 240, 100, 40);
		//添加滚动条
		JPanel jp = new JPanel();
		jp.setBounds(120, 25, 599, 265);
//		jp.setBackground(new Color(100, 100, 100));//测试代码
		//实例化文本区域
//		jTextA = new JTextArea("请输入信息……");
		jTextA = new JTextArea("请输入信息……",14,66);
//		jTextA.setBounds(120, 30, 1200, 250);
		jTextA.setFont(new Font("宋体", Font.BOLD, 15));
		//给文本区域加入滚动条
		JScrollPane jsp = new JScrollPane(jTextA);
		/*加载组建*/
		jp.add(jsp);//将加入了滚动条的文本框添加到JPanel中
		jfSub.add(jp);//将JPanel加入到JFrame中
		jfSub.add(subJBOne);
		jfSub.add(subJBTwo);
		jfSub.add(subJBThree);
		jfSub.add(subJBFour);
//		jfSub.add(jTextA);
		return jfSub;
	}

}
