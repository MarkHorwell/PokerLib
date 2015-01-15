package za.org.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains a set of common functions that will be used accross various 
 * classes.
 *  
 * @author Mark Horwell (f3632210)
 */
public class Utils {

	
	/**
	 * Counts the number of suited cards in a set of cards.
	 * @param cards are cards we want to search in
	 * @param suit is the suit that we are looking for.
	 * @return
	 */
	public static int countSuitedCards(List<Card> cards, Suit suit) {
		
		// no cards or suit will return a 0.  der...
		if ((cards == null) || (suit == null))
			return 0;
		
		return getSuitedCards(cards, suit).size(); 
	}

	

	/**
	 * Looks for all the cards of a specific suit in a list of cards.
	 * @param cards are cards we want to search in
	 * @param suit is the suit that we are looking for.
	 * @return a list of suited cards.
	 */
	public static List<Card> getSuitedCards(List<Card> cards, Suit suit) {
		List<Card> suitedCards = new ArrayList<Card>();
		
		// no cards or suit will return an empty array;
		if ((cards != null) || (suit != null)) {
			for (Card card : cards) {
				if (card.getSuit() == suit) {
					suitedCards.add(card);
				}
			}
		}

		return cards;   
	}

}
