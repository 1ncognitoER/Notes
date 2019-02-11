package inClass;

import java.util.LinkedList;

/**
 * 集合封装
 * @author Blood Moon
 *
 */
public class ZhanDui {
	private LinkedList linked;

	public ZhanDui() {
		this.linked= new LinkedList();
	}
	public void addData(Object obj){
		this.linked.addFirst(obj);
	}
	public Object getData(){
		//模拟栈：先进后出
//		return linked.pollFirst();
		//模拟队列：先进先出
		return linked.pollLast();
	}
	public boolean isEmpty(){
		return linked.isEmpty();
	}
	
}
