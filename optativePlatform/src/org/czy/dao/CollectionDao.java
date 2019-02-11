package org.czy.dao;

import org.czy.bean.Collection;

public interface CollectionDao {
	/**
	 * 添加关注
	 * @param image
	 */
	public void collection(Collection collection);
	/**
	 * 查询用户所有关注
	 * @param collection
	 * @return
	 */
	public Collection searchAllCollection(Collection collection);
	/**
	 * 取消关注
	 * @param collection
	 */
	public void unsubscribe(Collection collection);
	
}
