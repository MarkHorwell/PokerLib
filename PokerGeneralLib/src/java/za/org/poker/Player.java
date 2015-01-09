package za.org.poker;

import java.io.Serializable;
import java.util.List;

/**
 * This is a base class to represent a poker player sitting at a table.  This class
 * built to be extended based on the type of poker and information that you want to track.  
 * 
 * @author Mark Horwell (f3632210)
 *
 */
public abstract class Player implements Serializable {

	private static final long serialVersionUID = 5738730674295450434L;

	
	/**
	 * this variable is final to prevent people mistakenly changing the name between hands as
	 * and screwing up the statistics captured around the player.
	 */
	private final String name;


	/**
	 * This is the default constructor.
	 * @param name is the name or description of the player.  This should never be empty of blank
	 * 
	 */
	public Player(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name of the poker player
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the cards that are in the player's Hand. AKA (Hole Cards)
	 */
	public abstract List<Card> getHoleCards(); 
}
