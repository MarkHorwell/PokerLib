package za.org.poker.texas;

import java.util.ArrayList;
import java.util.List;

import za.org.poker.Card;
import za.org.poker.Player;
import za.org.poker.Table;

/**
 * This class is a representation of a texas hold'em table.  This class

 * @author Mark Horwell (f3632210)
 *
 */
public class TexasTable extends Table {

	private static final long serialVersionUID = -7147444285549415822L;
	
	//	this is the 1st 3 cards that are added to the board.
	private List<Card> flop; 
	
	//	this is the final card that is added to the board; 
	private Card river; 

	//	this is the 4th card that is added to the board; 
	private Card turn; 
		
	/**
	 * This class only supports players of type za.org.poker.texas.TexasPlayer.
	 *  
	 * (non-Javadoc)
	 * @see za.org.poker.Table#getBaseClassOfPlayer()
	 */
	@Override
	protected Class<? extends Player> getBaseClassOfPlayer() {
		return TexasPlayer.class; 
	}


	public TexasTable() {
		super();
	}


	public TexasTable(int numberOfPlayers, Class<? extends TexasPlayer> playerClass)
			throws Exception {
		super(numberOfPlayers, playerClass);
	}


	public TexasTable(int numberOfPlayers)
			throws Exception {
		super(numberOfPlayers);
	}


	/**
	 * Deals 2 hole cards to each player. 
	 * @throws Exception
	 */
	public void dealCards() throws Exception {
		super.dealCards(TexasPlayer.MAX_NUMBER_OF_HOLE_CARDS);
	}
	
	
	/**
	 * Deals the flop to the board.
	 * @throws Exception
	 */
	public void dealFlop() throws Exception { 
		flop = new ArrayList<Card>(); 
		flop.add(getDeckOfCards().drawNextRandomCard());
		flop.add(getDeckOfCards().drawNextRandomCard());
		flop.add(getDeckOfCards().drawNextRandomCard());
	}
	
	
	/**
	 * Deals the Turn card to the board.
	 * @throws Exception
	 */
	public void dealTheTurn() throws Exception { 
		turn = getDeckOfCards().drawNextRandomCard();
	}
	

	/**
	 * Deals the river card to the board.
	 * @throws Exception
	 */
	public void dealTheRiver() throws Exception { 
		river = getDeckOfCards().drawNextRandomCard();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TexasTable [flop=" + flop + ", river=" + river + ", turn="
				+ turn + "]";
	}
	
}
