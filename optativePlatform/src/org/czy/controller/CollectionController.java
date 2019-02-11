package org.czy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.czy.bean.Collection;
import org.czy.bean.User;
import org.czy.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CollectionController {
	/*属性*/
	private CollectionService collectionService;
	public CollectionService getCollectionService() {
		return collectionService;
	}
	@Autowired
	public void setCollectionService(CollectionService collectionService) {
		this.collectionService = collectionService;
	}
	/**
	 * 添加关注
	 * @param carid
	 * @param request
	 * @param response
	 */
	@RequestMapping("collection")
	public void collection(String carid, HttpServletRequest request, HttpServletResponse response, HttpSession session){
		int carId = Integer.parseInt(carid);
		try {
			PrintWriter pw = response.getWriter();
			User user = (User) session.getAttribute("userInformation");
			if (user != null) {//用户已登录，添加收藏
				Collection collection = new Collection(user.getUserId(), carId);
				collectionService.collection(collection);//添加关注
				pw.write("1");
			} else {//用户没有登录
				pw.write("0");
			}
			pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 获取用户收藏信息
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("searchUserCollection")
	@ResponseBody
	public Object searchUserCollection(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		User user = (User) session.getAttribute("userInformation");
		if (user != null) {//用户已登录，查询收藏
			Collection collections = collectionService.searchAllCollection(new Collection(user.getUserId(), 0));//查询用户id关注
			if (collections!=null) {//存在收藏数据，直接放回收藏数据
				return collections;
			} else {//不存在收藏数据,新建一个userId为0的对象返回Ajax
				Collection col = new Collection(0, 0, null);
				return col;
			}
		} else {//未登录，新建一个userId为-1的对象返回Ajax
			Collection coll = new Collection(-1, 0, null);
			return coll;
		}
	}
	/**
	 * 取消关注
	 * @param carid
	 * @param request
	 * @param response
	 * @param session
	 */
	@RequestMapping("unsubscribe")
	public void unsubscribe(String carid, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		int carId = Integer.parseInt(carid);//获取汽车id
		User user = (User) session.getAttribute("userInformation");//从session中获得用户id
		Collection collection = new Collection(user.getUserId(), carId);
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			collectionService.unsubscribe(collection);
			pw.write("1");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			pw.write("0");
			pw.flush();
			pw.close();
		}
	}
	
}
