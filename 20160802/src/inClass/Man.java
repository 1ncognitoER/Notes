package inClass;

public class Man extends People {
	int high;

	public Man() {
		super();
	}

	public Man(String name, String sex, int high) {
		super(name, sex);
		this.high = high;
	}

	public People show(){
		return new People("成龙","男");
	}
	/**
	 * 重写equal方法 用于判断两个对象是否相等
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Man){
			Man m= (Man)obj;
			if(m.name.equals(this.name) && m.sex.equals(this.sex) && m.high==this.high){
				return true;
			}
		}
		return false;
	}
	
	
	
//	public Man show() {
//		return new Man("胡歌", "男",178);
//	}

	@Override
	public String toString() {
		return "Man [name="+super.name+" high=" + high + "]";
	}

}