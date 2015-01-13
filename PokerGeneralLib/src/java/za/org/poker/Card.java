package za.org.poker;

import javax.jws.Oneway;


/**
 * This object is used to represent all the playing cards that may be used in a deck.
 * 
 * @author Mark Horwell (f3632210)
 *
 */

public class Card {

	private final Suit suit; 
	
	private final Rank rank;

	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	/**
	 * @return the suit
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * @return the rank
	 */
	public Rank getRank() {
		return rank;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}
	
}
