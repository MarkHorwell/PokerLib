package za.org.poker;


/**
 * This enum represents all the ranks that can be visible on any card in the deck.
 * 
 * @author Mark Horwell (f3632210)
 *
 */
public enum Rank {
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);	

	private final Integer rank;

	private Rank(Integer rank) {
		this.rank = rank;
	}

	/**
	 * @return the tan expressed as an integer.  This allows us to compare cards of different
	 * ranks to determine who has the highest rank.
	 */
	public Integer getRank() {
		return rank;
	} 

}
