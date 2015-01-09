package za.org.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Mark Horwell (f3632210)
 *
 */
public class Deck {

	private List<Card> cardsInDeck = new ArrayList<Card>();
	
	
	/**
	 * This is the default constructor and populates the deck with all possible cards.
	 */
	public Deck() {
		
		//	add all the clubs
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.ACE));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.TWO));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.THREE));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.FOUR));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.FIVE));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.SIX));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.SEVEN));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.EIGHT));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.NINE));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.TEN));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.JACK));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.QUEEN));
		cardsInDeck.add(new Card(Suit.CLUBS, Rank.KING));

		//	add all the diamonds
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.ACE));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.TWO));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.THREE));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.FOUR));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.FIVE));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.SIX));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.SEVEN));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.EIGHT));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.NINE));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.TEN));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.JACK));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.QUEEN));
		cardsInDeck.add(new Card(Suit.DIAMONDS, Rank.KING));
		
		//	add all the hearts
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.ACE));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.TWO));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.THREE));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.FOUR));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.FIVE));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.SIX));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.SEVEN));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.EIGHT));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.NINE));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.TEN));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.JACK));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.QUEEN));
		cardsInDeck.add(new Card(Suit.HEARTS, Rank.KING));
		
		//	add all the spades
		cardsInDeck.add(new Card(Suit.SPADES, Rank.ACE));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.TWO));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.THREE));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.FOUR));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.FIVE));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.SIX));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.SEVEN));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.EIGHT));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.NINE));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.TEN));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.JACK));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.QUEEN));
		cardsInDeck.add(new Card(Suit.SPADES, Rank.KING));
	}
	
	
	/**
	 * This method is used to shuffle the deck multiple time.  This method has been 
	 * created for anyone who doesn't trust shuffling the deck only once.
	 * 
	 * @param numberOfShuffles indicates how many times you would like to shuffle the deck
	 * @throws Exception is thrown if an invalid argument is is used. 
	 */
	public void shuffleTheDeck(int numberOfShuffles) throws Exception {
		
		//	check that the argument for number of shuffles is positive and not being abused.
		if (numberOfShuffles < 1)
			throw new Exception("The supplied argument has be a positive integer."); 
		
		for (int x = 0; x <  numberOfShuffles; x++)
			shuffleTheDeck(); 
	}
	
	
	/**
	 * This method shuffles the deck only once.
	 */
	public void shuffleTheDeck() {
		Collections.shuffle(cardsInDeck);
	}
	
	
	/**
	 * This method draws the next card in the deck.  You need to shuffle the deck before
	 * call this method.  
	 *  
	 * @return returns the next random card
	 * @throws Exception is thrown if there are no more cards left in the deck. 
	 */
	public Card drawNextRandomCard() throws Exception {
		if (cardsInDeck.size() == 0)
			throw new Exception("There are no more cards left in the deck."); 
		
		Card card = cardsInDeck.get(0); 
		cardsInDeck.remove(0);
		return card;
	}
	
	/**
	 * @return the number of cards remaining in the deck. 
	 */
	public int getNumberOfCardsRemaining() { 
		return cardsInDeck.size(); 
	}
}
