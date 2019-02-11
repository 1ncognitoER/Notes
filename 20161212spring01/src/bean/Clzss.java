package bean;

import java.util.List;
import java.util.Map;

public class Clzss {
	private int clzssId;
	private String clzssName;
	
	private List<Student> SList;
	
	public List<Student> getSList() {
		return SList;
	}
	public void setSList(List<Student> sList) {
		SList = sList;
	}
	
	/*private List<String> SList;
	public List<String> getSList() {
		return SList;
	}
	public void setSList(List<String> sList) {
		SList = sList;
	}*/
	
	/*private Map<Integer, String> SList;
	public Map<Integer, String> getSList() {
		return SList;
	}
	public void setSList(Map<Integer, String> sList) {
		SList = sList;
	}*/
	@Override
	public String toString() {
		return "Clzss [clzssId=" + clzssId + ", clzssName=" + clzssName + ", SList=" + SList + "]";
	}
	public Clzss(int clzssId, String clzssName) {
		super();
		this.clzssId = clzssId;
		this.clzssName = clzssName;
	}
	public Clzss() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClzssId() {
		return clzssId;
	}
	public void setClzssId(int clzssId) {
		this.clzssId = clzssId;
	}
	public String getClzssName() {
		return clzssName;
	}
	public void setClzssName(String clzssName) {
		this.clzssName = clzssName;
	}
	
}
