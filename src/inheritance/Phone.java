package inheritance;

public class Phone {
	private String name;
	private String os;
	
	public Phone(String name, String os) {
		this.name = name;
		this.os = os;
	}
	
	public String toString() {
		return "Phone: " + name + '\n' + "OS: " + os;
	}
}
