package za.org.poker;

import java.io.Serializable;
import java.util.List;

import za.org.poker.exceptions.InvalidStackSizeException;

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
	 * The stack indicates how many chips a specific play has at any point in time.
	 */
	private double stack;

	
	/**
	 * This is the default constructor.
	 * @param name is the name or description of the player.  This should never be empty of blank
	 * @param stack is the number of chips that the player is sitting with
	 * @throws InvalidStackSizeException thrown if a stack is set to less than zero.
	 * 
	 */
	public Player(String name, double stack) throws InvalidStackSizeException  {
		this(name);
		setStack(stack);
	}
	
	
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

	/**
	 * @return returns the number of amount of chips that the player holds
	 */
	public double getStack() {
		return stack;
	}

	/** 
	 * @param stack the amount of chips that a player has.
	 * @throws InvalidStackSizeException if the amount of chips is set to less than zero.
	 */
	public void setStack(double stack) throws InvalidStackSizeException {

		//	stacks are not allowed to be less than zero. At this point you have lost the game
		if (stack < 0)
			throw new InvalidStackSizeException("Player [" + name + "] has a stack of less than 0.");
		
		this.stack = stack;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", stack=" + stack + ", getHoleCards()=" + getHoleCards() + "]";
	}

}
