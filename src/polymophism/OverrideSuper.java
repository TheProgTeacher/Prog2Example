package polymophism;

public class OverrideSuper {
	private String str;
	
	public OverrideSuper(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
	@Override
	public String toString() {
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OverrideSuper)
			return str.equals(((OverrideSuper)obj).getStr());
		else
			return false;
	}
}
