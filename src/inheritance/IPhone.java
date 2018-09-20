package inheritance;

public class IPhone extends Phone{
	
	private boolean holoScreen;
	
	public IPhone(String name, boolean hs) {
		super(name, "IOS"); //m�ste st� f�rst!
		holoScreen = hs;
	}
	
	@Override
	public String toString() {
		return super.toString() + '\n' + "HoloScreen: " + holoScreen;
	}
}
