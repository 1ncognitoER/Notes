package afterClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * 
 * @author Blood Moon
 *
 */
public class Index extends JFrame {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/* 主窗体jFrame */
		JFrame jFrame = new JFrame("Students Management System");
		// 设置布局方式,null表示默认方式
		jFrame.setLayout(null);
		// 设置组件布局
		jFrame.setBounds(0, 0, 600, 400);

		/* 子窗体 */
		// 创建文本录入和显示区域
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 5, 565, 280);
		// 创建按钮区域
		JButton button_add = new JButton("添加");// 610
		button_add.setBounds(10, 300, 100, 50);// 600-110=490//480-300=180
		JButton button_search = new JButton("查询");// 180/3=60
		button_search.setBounds(170, 300, 100, 50);
		JButton button_modify = new JButton("修改");
		button_modify.setBounds(330, 300, 100, 50);
		JButton button_delete = new JButton("删除");
		button_delete.setBounds(470, 300, 100, 50);

		// 将组件添加到主题框架中
		jFrame.add(textArea);
		jFrame.add(button_add);
		jFrame.add(button_search);
		jFrame.add(button_modify);
		jFrame.add(button_delete);
		// 显示窗体
		jFrame.setVisible(true);

		/* 初始化数据 */
//		List<Students> data = new ArrayList<Students>();
//		data.add(new Students(001, "zy", 20, "JAVAprogramer"));
//		data.add(new Students(002, "xx", 22, "programer"));
//		FileDeal.writeFile(data);
		// //测试代码
		// for (Students students : FileDeal.readFile()) {
		// System.out.println("test01"+students);
		// }

		/* 建立监听事件 */
		// 添加
		button_add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 从界面录入数据
				String data = textArea.getText();
				StudentDo sd = new StudentDo();
				// 将数据显示到界面
				try {
					textArea.setText(sd.add(data));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		// 查询
		button_search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//按名称来查询
				String name = textArea.getText();
				StudentDo sd = new StudentDo();
				try {
					textArea.setText(sd.search(name));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		// 修改
		button_modify.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String data = textArea.getText();
				StudentDo sd = new StudentDo();
				try {
					textArea.setText(sd.modify(data));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		// 删除
		button_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				long idNum = Integer.parseInt(textArea.getText());
				StudentDo sd = new StudentDo();
				try {
					textArea.setText(sd.delete(idNum));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}

}