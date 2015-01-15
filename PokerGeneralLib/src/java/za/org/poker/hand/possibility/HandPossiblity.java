package za.org.poker.hand.possibility;

import java.util.ArrayList;
import java.util.List;

import za.org.poker.Card;

/**
 * This abstract class is used in various scenarios and identify what is still possible.
 * This is done by looking at 2 key factors:
 * - What cards are currently visible.
 * - How many cards are still to be drawn.
 *  
 * @author Mark Horwell (f3632210)
 *
 */
public abstract class HandPossiblity {
	
	protected final List<Card> visibleCards;
	
	protected final int numberOfcardsToBeDrawn;
	
	/**
	 * 
	 * @param visibleCards are the cards that are visible in the hand.
	 * @param numberOfcardsToBeDrawn is the number of cards still to be drawn.
	 */
	public HandPossiblity(List<Card> visibleCards, int numberOfcardsToBeDrawn) throws Exception {
		super();
		
		//	this is just to put a standard in place so that sub classes don't have to constantly 
		//  check if it's null 
		if (visibleCards == null) {
			this.visibleCards = new ArrayList<Card>(); 
		} else {
			this.visibleCards = visibleCards;
		}
		
		if (numberOfcardsToBeDrawn < 0)
			throw new Exception("The number of cardsToBeDrawn needs to be 0 or greater."); 
		
		this.numberOfcardsToBeDrawn = numberOfcardsToBeDrawn;
	}

	/**
	 * This method to see if a specific hand is still possible.
	 * @return true if it is still possible and false if it is not possible.
	 */
	public abstract boolean isPossible() throws Exception;
		
}
