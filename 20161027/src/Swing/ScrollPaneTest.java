package Swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollPaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jf = new JFrame();
		jf.setLayout(null);
		jf.setBounds(0, 0, 500, 300);
		
		JPanel jp = new JPanel();
		jp.setBounds(30, 30, 300, 200);
		jp.setBackground(new Color(100, 100, 100));
		
		JTextArea jta = new JTextArea("12345678901234567890", 2, 10);
//		jta.setBounds(0, 0, 300, 100);//无用的语句
		JScrollPane jsp = new JScrollPane(jta);
//		jsp.setBounds(0, 0, 150, 100);无用的语句
		
		jp.add(jsp);
		jf.add(jp);
		jf.setVisible(true);
		
	}

}