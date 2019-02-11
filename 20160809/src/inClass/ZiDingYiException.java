package inClass;

public class ZiDingYiException extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	private String mas;

	public ZiDingYiException(String mas) {
		super();
		this.mas = mas;
	}

	@Override
	public String toString() {
		return mas;
	}
	
}
