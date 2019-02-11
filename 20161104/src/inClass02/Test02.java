package inClass02;

public class Test02 {

	/**
	 * 对数据库的数据进行管理
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUDHandle handle = new CRUDHandle();
		try {
//			handle.add("class002");
//			handle.delete(6);
//			handle.modify(5, "class002");
			handle.search("classplus");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
