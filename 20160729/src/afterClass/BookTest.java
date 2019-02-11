package afterClass;

public class BookTest {

	public static void main(String[] args) {
		Book bo= new Book("红楼梦","曹雪芹","人民出版社",129);
		bo.show();
		
		Book bo1= new Book("三国演义","罗贯中","人民文学出版社",89);
		bo1.show();
		
		Book bo2= new Book("水浒传","施耐庵","人民文学出版社",9);
		bo2.show();
		
		Book bo3= new Book("西游记","吴承恩","人民文学出版社",119);
		bo3.show();
	}

}
