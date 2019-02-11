package org.czy.serviceImpl;

import org.czy.bean.Collection;
import org.czy.dao.CollectionDao;
import org.czy.service.CollectionService;

public class CollectionServiceImpl implements CollectionService {
	/* 属性 */
	private CollectionDao collectionDao;
	public CollectionDao getCollectionDao() {
		return collectionDao;
	}
	public void setCollectionDao(CollectionDao collectionDao) {
		this.collectionDao = collectionDao;
	}
	/**
	 * 添加关注
	 */
	@Override
	public void collection(Collection collection) {
		collectionDao.collection(collection);
	}
	/**
	 * 查询用户所有收藏
	 */
	@Override
	public Collection searchAllCollection(Collection collection) {
		return collectionDao.searchAllCollection(collection);
	}
	/**
	 * 取消关注
	 */
	@Override
	public void unsubscribe(Collection collection) {
		collectionDao.unsubscribe(collection);
	}
	
}
