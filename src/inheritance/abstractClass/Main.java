package inheritance.abstractClass;

public class Main {
	public static void main(String[] args) {
		Vehicle v1 = new Car(12,12,12);
		Vehicle v2 = new Boat(12, 12, 234);
		
		System.out.println(v1.changeSpeed(12));
		System.out.println(v2.changeSpeed(12));
	}
}

