package inheritance.interfaces;

public class Boat extends Vehicle{
	int deadweight;
	
	Boat(int w, double s, int d) {
		super(w, s);
		deadweight = d;
	}
	
	String turn(String s) {
		if(s.equals("left"))
			return "turned left";
		else if(s.equals("right"))
			return "turned right";
		else
			return "going straight";
	}
}
