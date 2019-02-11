package org.czy.service;

import org.czy.bean.User;

public interface UserService {
	/**
	 * 根据名称查询用户
	 * @param user
	 * @return
	 */
	public User searchUserByName(User user);
	/**
	 * 用户注册
	 * @param user
	 */
	public void register(User user);
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User userLogin(User user);
	
}
