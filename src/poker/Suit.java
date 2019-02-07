package poker;

public enum Suit {
	HEARTS(1), CLUBS(2), DIAMONDS(3), SPADES(4);
	
	private int nv;
	
	private Suit(int numericValue) {
		nv = numericValue;
	}
	
	public int numericValue() {
		return nv;
	}
}
