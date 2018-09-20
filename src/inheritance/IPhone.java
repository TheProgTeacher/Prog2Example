package inheritance;

public class IPhone extends Phone{
	
	private boolean holoScreen;
	
	public IPhone(String name, boolean hs) {
		super(name, "IOS"); //måste stå först!
		holoScreen = hs;
	}
	
	@Override
	public String toString() {
		return super.toString() + '\n' + "HoloScreen: " + holoScreen;
	}
}
