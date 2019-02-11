package phone;

public class PhoneTest {
	public static void main(String[] args) {
		PhoneCard ph = new Phones();
		Card card = new Card();
		ph.readCard(card.cons(new ChinaMobile("中国移动")));
		ph.readCard(card.cons(new ChinaTelecom("中国电信")));
		ph.readCard(card.cons(new ChinaUnicom("中国联通")));
	}
}