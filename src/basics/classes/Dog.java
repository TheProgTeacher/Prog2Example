package basics.classes;


public class Dog {
	public static final String sound = "BARK!";
	public final String name;
	
	private boolean sleeping;
	private int legs;
	private DogColor color;
	
	//Konstruktor
	public Dog(String n, boolean s, int l, DogColor c) {
		name = n;
		sleeping = s;
		setLegs(l);
		color = c;
	}
	
	public String toString() {
		return 	"Dog: " + name + '\n' +
				"Sleeping: " + sleeping + '\n' +
				"Legs: " + legs + '\n' +
				"Color : " + color;
	}
	
	public void setSleeping(boolean s) { sleeping = s; }
	public boolean getSleeping() { return sleeping; }
	
	public void setLegs(int l) {
		if(l == 0 || l < 5)
			legs = l;
		else
			legs = 4;
	}
	public int getLegs() { return legs; }
	
	public void setColor(DogColor c) { color = c; }
	public DogColor getColor() { return color; }
}
