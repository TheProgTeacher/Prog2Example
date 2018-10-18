package inheritance.interfaces;

public class Car implements Vehicle{
	double horsepower;
	
	Car(int w, double s, double h) {
		horsepower = h;
	}
	
	double changeGear(int i) {
		return 10.0/i * horsepower;
	}
	
	@Override
	public void changeSpeed(double s) {
		
	}
}
