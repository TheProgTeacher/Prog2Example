package polymophism;

public class Overloading {
	
	private String str;
	private int i;
	private double d;
	
	public Overloading() {
		str = "null";
		i = 0;
		d = 0;
	}
	
	public Overloading(String str) {
		this.str = str;
		i = 0;
		d = 0;
	}
	
	public Overloading(String str, int i) {
		this.str = str;
		this.i = i;
		d = 0;
	}
	
	public Overloading(String str, int i, double d) {
		this.str = str;
		this.i = i;
		this.d = d;
	}
	
	public void add(String str) {
		this.str += str;
	}
	
	public void add(int i) {
		this.i += i;
	}

	public void add(double d) {
		this.d += d;
	}
}
