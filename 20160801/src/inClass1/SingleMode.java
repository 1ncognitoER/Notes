package inClass1;

public class SingleMode {
	
	private int numer;
	
	private  SingleMode(int numer) {
		super();
		this.numer = numer;
	}

	static final SingleMode s = new SingleMode(987);
	
	public static SingleMode getIt(){
		return s;
	}

	@Override
	public String toString() {
		return "SingleMode [numer=" + numer + "]";
	}
}
