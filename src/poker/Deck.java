package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<>();

	public Deck(boolean fill) {
		if(fill)
			for(Suit s : Suit.values())
				for(Value v : Value.values())
					cards.add(new Card(v, s));
	}

	public Card draw(){
		return cards.get(cards.size() - 1);
	}

	public void add(Card card) {
		cards.add(card);
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public void sort() {
		Collections.sort(cards);
	}

	public void sort(Comparator<Card> comp) {
		Collections.sort(cards, comp);
	}

	public boolean greaterThan(Deck d) {
		if(royalStreightFlush()) {

		}
		else if(streightFlush()) {
			
		}
		else if(fourOfAKind()) {
			
		}
		else if(fullHouse()) {
		
		}
		else if(flush()) {
			
		}
		else if(streight()) {
			
		}
		else if(threeOfAKind()) {
			
		}
		else if(twoPairs()) {
			
		}
		else if(pair()) {
			
		}
		
		
		return false;
	}
	
	@Override
	public String toString() {
		String out = new String();
		for(Card c : cards)
			out += c.toString() + '\n';
		return out;	
	}
}

/*
class Deck<TYPE> {
	private ArrayList<TYPE> cards = new ArrayList<>();
}
*/

