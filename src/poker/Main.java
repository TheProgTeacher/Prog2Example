package poker;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.print(d);
	}
}

class Deck2<TYPE> {
	private ArrayList<TYPE> cards = new ArrayList<>();
}

class Deck {
	private ArrayList<Card> cards = new ArrayList<>();
	
	public Deck() {
		for(Suit s : Suit.values())
			for(Value v : Value.values())
				cards.add(new Card(s, v));
		Collections.shuffle(cards);
	}
	
	public String toString() {
		String out = new String();
		for(Card c : cards)
			out += c.toString() + '\n';
		return out;	
	}
}

class Card {
	private Suit suit;
	private Value value;
	
	public Card(Suit s, Value v) {
		suit = s;
		value = v;
	}
	
	public String toString() {
		return suit + " " + value;
	}
}

enum Suit {
	HEARTS, CLUBS, DIAMONDS, SPADES;
}

enum Value {
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
}

