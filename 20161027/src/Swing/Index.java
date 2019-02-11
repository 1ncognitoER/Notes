package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Index extends JFrame{
	/**
	 * @param args
	 * 
	 * 界面编程
	 * 
	 */
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("BUFFOON");
		//设置布局方式,采用默认方式
		jFrame.setLayout(null);
		//给组件设置布局
		jFrame.setBounds(50, 50,497, 400);
		//创建显示和输入区域
		final JTextArea jTextArea =  new JTextArea("显示和输入区域");
		jTextArea.setBounds(10, 10, 460,200);
		jFrame.add(jTextArea);
		JButton jButton_add = new JButton("添加");
		JButton jButton_delete = new JButton("删除");
		JButton jButton_update = new JButton("修改");
		JButton jButton_find = new JButton("查询");
		
		jButton_add.setBounds(10, 230, 85, 30);
		jButton_delete.setBounds(135, 230, 85, 30);
		jButton_update.setBounds(260,230, 85, 30);
		jButton_find.setBounds(385, 230, 85, 30);
		jFrame.add(jButton_add);
		jFrame.add(jButton_delete);
		jFrame.add(jButton_update);
		jFrame.add(jButton_find);
		//显示界面
		jFrame.setVisible(true);
		
		
		jButton_find.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//获取文本区域输入的内容
				String text = jTextArea.getText();
				//System.out.println(text);
				//文本区域设置显示内容
				jTextArea.setText("查询成功");
			}
		});
	}
}