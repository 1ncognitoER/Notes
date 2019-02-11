package phone;

public class Phones implements PhoneCard {

	@Override
	public void readCard(Card card) {
		card.show();
	}


}
