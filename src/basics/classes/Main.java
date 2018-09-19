package basics.classes;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Baltasar", true, 4, DogColor.ORANGE);
		out.println(dog);
		Dog dog2 = new Dog("Maxima", false, 3, DogColor.BLACK);
		out.println(dog2);
		out.println(dog.name + ": " + dog.sound);
	}
}