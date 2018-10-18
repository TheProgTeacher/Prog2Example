package inheritance.abstractClass;

public abstract class Vehicle {
	int weight;
	double speed;
	
	Vehicle(int w, double s) {
		weight = w;
		speed = s;
	}
	
	abstract double changeSpeed();
}
