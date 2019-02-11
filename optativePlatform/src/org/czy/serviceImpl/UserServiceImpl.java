package org.czy.serviceImpl;

import org.czy.bean.User;
import org.czy.dao.UserDao;
import org.czy.service.UserService;

public class UserServiceImpl implements UserService {
	/*属性*/
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * 用户名检测
	 */
	@Override
	public User searchUserByName(User user) {
		return userDao.searchUserByName(user);
	}
	/**
	 * 用户注册
	 */
	@Override
	public void register(User user) {
		userDao.register(user);
	}
	/**
	 * 用户登录
	 */
	@Override
	public User userLogin(User user) {
		return userDao.userLogin(user);
	}
}
