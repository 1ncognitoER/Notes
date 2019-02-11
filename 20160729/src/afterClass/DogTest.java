package afterClass;

public class DogTest {

	public static void main(String[] args) {
		Dog d = new Dog("腥红之月","哈士奇",6,"unhappy");
		d.show();
		d.makeSound();
		d.run();
		
		Dog d1 = new Dog("腥红","拉布拉多",3,"inhappy");
		d1.show();
		d1.makeSound();
		d1.run();
		
	}

}
