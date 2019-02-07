package poker;

public class Card implements Comparable<Card>{
	private Suit suit;
	private Value value;
	
	public Card(Value v, Suit s) {
		suit = s;
		value = v;
	}
	
	@Override
	public String toString() {
		return value + " OF " + suit;
	}
	
	@Override
	public int compareTo(Card card) {
		int tSuitNV = suit.numericValue();
		int tValueNV = value.numericValue();
		int oSuitNV = card.suit.numericValue();
		int oValueNV = card.value.numericValue();
		
		return ((tSuitNV - 1) * 13 + tValueNV) - ((oSuitNV - 1) * 13 + oValueNV);
	}
}
