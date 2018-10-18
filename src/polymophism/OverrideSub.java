package polymophism;

public class OverrideSub extends OverrideSuper {
	private String str2;
	
	public OverrideSub(String str, String str2) {
		super(str);
		this.str2 = str2;
	}
	
	public String getStr2() {
		return str2;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + str2;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OverrideSub)
			return getStr().equals(((OverrideSub)obj).getStr()) &&
					str2.equals(((OverrideSub)obj).getStr2());
		else
			return false;
	}
}
