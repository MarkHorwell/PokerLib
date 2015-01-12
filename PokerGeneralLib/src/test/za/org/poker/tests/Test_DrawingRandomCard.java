package za.org.poker.tests;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import za.org.poker.Card;
import za.org.poker.Deck;

 /**
 * This JUnit Test is merely there to test and demonstrate how to pull a random
 * card from the deck 
 * 
 * @author Mark Horwell (f3632210)
 *
 */
public class Test_DrawingRandomCard { 
	
	private Deck deck; 
	
	@Before
	public void setup() throws Exception {
		
		deck = new Deck(); 
		Integer numberOfShuffles = Calendar.getInstance().get(Calendar.SECOND);
		System.out.println("Shuffling the deck, " +  numberOfShuffles + " number of times.");
		deck.shuffleTheDeck(numberOfShuffles);
	}
	
	@Test
	public void test() throws Exception {
		Card card = deck.drawNextRandomCard();
		System.out.println("Drawn Card, " + card);
	}

}
