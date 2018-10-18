package inheritance.abstractClass;

public class Car extends Vehicle{
	double horsepower;
	
	Car(int w, double s, double h) {
		super(w, s);
		horsepower = h;
	}
	
	double changeGear(int i) {
		return 10.0/i * horsepower;
	}
	
	@Override
	public double changeSpeed() {
		return horsepower * 10;
	}
}
