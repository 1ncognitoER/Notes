package studentManageSystemPLUS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Index extends JFrame {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		window();
	}

	protected static void window() {
		// 设置主窗体
		Frame frame = new Frame();
		JFrame jf = frame.makeSupWindow();
		jf.setVisible(true);// 显示窗体
		// 管理员登陆监听
		frame.jbOne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String account = frame.jtfOne.getText();
				String password = frame.jtfTwo.getText();
				// 管理员登录验证
				CRUDDeal crud = new CRUDDeal();
				try {
					if (crud.adminLogin(account, password)) {
						// 登录成功，关闭jf的登录界面
						jf.setVisible(false);
						// 打开管理员界面
						Frame frameAdmin = new Frame();
						JFrame jfSub = frameAdmin.makeSubWindow();
						jfSub.setVisible(true);
						/**
						 * 创建子窗口的监听器
						 * 
						 */
						// 查询
						frameAdmin.subJBOne.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								// Frame searchFra = new Frame();
								// String textData =
								// frameAdmin.jAdminT.getText();
								try {
									frameAdmin.jTextA.setText(crud.adminSearch());
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});
						// 添加
						frameAdmin.subJBTwo.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								String strData = frameAdmin.jTextA.getText();
								try {
									frameAdmin.jTextA.setText(crud.add(strData));
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});
						// 修改
						frameAdmin.subJBThree.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								String strData = frameAdmin.jTextA.getText();
								try {
									frameAdmin.jTextA.setText(crud.modify(strData));
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});
						// 删除
						frameAdmin.subJBFour.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								String strData = frameAdmin.jTextA.getText();
								try {
									frameAdmin.jTextA.setText(crud.delete(strData));
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});

					} else {
						// 登录错误提示
						Icon icon = new ImageIcon(
								"E:\\Eclipse\\projects\\src\\studentManageSystemPLUS\\files\\icon.png");
						int exi = JOptionPane.showConfirmDialog(null, "登录失败，要重新登录吗？", "Wring！",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
						if (exi == JOptionPane.NO_OPTION) {
							System.exit(0);
						}
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		// 学生登录监听
		frame.jbTwo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String account = frame.jtfOne.getText();
				String password = frame.jtfTwo.getText();
				// 学生登录验证
				CRUDDeal crud = new CRUDDeal();
				try {
					if (crud.studentLogin(account, password)) {
						// 登录成功，关闭jf的登录界面
						jf.setVisible(false);
						// 打开管理员界面
						Frame frameStu = new Frame();
						JFrame jfSub = frameStu.makeSubWindow();
						jfSub.setVisible(true);
						/**
						 * 创建子窗口的监听器
						 */
						// 查询
						frameStu.subJBOne.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								String name = frameStu.jTextA.getText();
								try {
									frameStu.jTextA.setText(crud.search(name));
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});
						// 添加
						frameStu.subJBTwo.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								String strData = frameStu.jTextA.getText();
								try {
									frameStu.jTextA.setText(crud.add(strData));
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});
						// 修改
						frameStu.subJBThree.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								String strData = frameStu.jTextA.getText();
								try {
									frameStu.jTextA.setText(crud.modify(strData));
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});
						// 删除
						frameStu.subJBFour.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								String strData = frameStu.jTextA.getText();
								try {
									frameStu.jTextA.setText(crud.delete(strData));
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});

					} else {
						// 登录错误提示
						Icon icon = new ImageIcon(
								"E:\\Eclipse\\projects\\src\\studentManageSystemPLUS\\files\\icon.png");
						int exi = JOptionPane.showConfirmDialog(null, "登录失败，要重新登录吗？", "Wring！",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
						if (exi == JOptionPane.NO_OPTION) {
							System.exit(0);
						}
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		// 学生注册监听
		frame.jbThree.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String account = frame.jtfOne.getText();
				String password = frame.jtfTwo.getText();
				if (account.equals("") || password.equals("")) {
					// 注册错误提示
					Icon icon = new ImageIcon("E:\\Eclipse\\projects\\src\\studentManageSystemPLUS\\files\\icon.png");
					int exi = JOptionPane.showConfirmDialog(null, "注册失败，要重新注册吗？", "Wring！", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
					if (exi == JOptionPane.NO_OPTION) {
						System.exit(0);
					}
				} else {
					//成功注册
					CRUDDeal crud = new CRUDDeal();
					try {
						crud.register(account, password);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					// 弹出一个提示窗 注册成功（一个“确定”按钮）
					Icon icon = new ImageIcon("E:\\Eclipse\\projects\\src\\studentManageSystemPLUS\\files\\icon1.png");
					JOptionPane.showMessageDialog(null, "注册成功！", "信息注册", JOptionPane.CLOSED_OPTION, icon);
				}
			}
		});
	}

}
