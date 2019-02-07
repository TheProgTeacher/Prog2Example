package poker;

public class Main {
	static Card[] royal = {
		new Card(Value.ACE, Suit.HEARTS),
		new Card(Value.TEN, Suit.HEARTS),
		new Card(Value.JACK, Suit.HEARTS),
		new Card(Value.QUEEN, Suit.HEARTS),
		new Card(Value.KING, Suit.HEARTS)
	};
	
	public static void main(String[] args) {
		Deck d = new Deck(false);
		for(Card c : royal)
			d.add(c);
		System.out.print(d);
	}
}
