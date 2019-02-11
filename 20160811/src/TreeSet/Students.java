package TreeSet;

public class Students implements Comparable {
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	/**
	 * 当add第一个元素时并不会进行比较操作
	 * 当add第二个元素的时候这里的this就会指向上一个（即第一个元素），通过compareTo实现比较
	 * 以此类推 this 始终指向上一个元素！！！
	 */
	@Override
	public int compareTo(Object o) {
		
//		if(((Students)o).getName().equals(this.getName())){
		if(((Students)o).getName().compareTo(this.getName())==0){
			return this.score-((Students)o).getScore();
		}else{
//			return ((Students)o).getName().compareTo(this.name);
			return this.name.compareTo(((Students)o).getName());
		}
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", score=" + score + "]";
	}
	
}
