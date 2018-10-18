package inheritance.interfaces;

public class Boat implements Vehicle{
	int deadweight;
	
	Boat(int w, double s, int d) {
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
	
	@Override
	public void changeSpeed(double s) {
		
	}
}
