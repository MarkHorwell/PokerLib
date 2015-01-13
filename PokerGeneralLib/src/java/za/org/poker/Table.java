package za.org.poker;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * This class represents a Poker table. 
 * 
 * @author Mark Horwell (f3632210)
 */
public abstract class Table implements Serializable {

	private static final long serialVersionUID = -8049389619142782320L;
	
	//	this array represents the players currently seated at the table. 
	private final List<Player> players = new ArrayList<Player>(); 
	
	//	this is the deck of cards associated with this table. 
	private Deck deckOfCards = new Deck(); 
	
	/**
	 * This method is called internally to ensure that only players of a certain type
	 * can sit at this table.  Example, you don't want Omaha players sitting a table that
	 * has been created for texas holdem players. 
	 * @return
	 */
	protected abstract Class<? extends Player> getBaseClassOfPlayer();

	
	/**
	 * Default constructor
	 */
	public Table(){
		super(); 
	}
	
	/**
	 * Sets up the table with a number of players pre-configured at the table.
	 *  
	 * @param numberOfPlayers indicates how many players should be seated at the table.  This
	 * is no a limitation on the number of players.  Players can still be added and removed
	 * after the table has been set up 
	 *
	 * @param Different poker games place different constraints on the player. Only players that
	 *  are of the type   For example
	 *  in Texas holdem the player will only have 2 hole cards, where as in other versions of
	 *  the game, players may have up to 5 hole cards.
	 *   
	 * @exception is thrown if numberOfPlayers is invalid. 
	 */
	public Table(int numberOfPlayers, Class<? extends Player> playerClass) throws Exception {
		super();
		
		if (numberOfPlayers < 1)
			throw new Exception("Number of players at a poker table needs to be 1 or more.");

		//	do a simple test to ensure that this type of player is equal or is a sub class of the
		//	base class  
		if (!getBaseClassOfPlayer().isInstance(
				playerClass.getConstructor(String.class).newInstance("Test"))) {
			throw new Exception("You are attempting to add players that are supported by this table. "
					+ "Player must be of type [" + getBaseClassOfPlayer().getCanonicalName() + "]");
		}
		
		for (int x = 0; x < numberOfPlayers; x++) {
			String playerName = "Player " + x; 
			
			players.add(playerClass.getConstructor(String.class).newInstance(playerName)); 
		}
	}
	
	/**
	 * Sets up the table with a number of players pre-configured at the table.
	 *  
	 * @param numberOfPlayers indicates how many players should be seated at the table.  This
	 * is no a limitation on the number of players.  Players can still be added and removed
	 * after the table has been set up 
	 *
	 *   
	 * @exception is thrown if numberOfPlayers is invalid. 
	 */
	public Table(int numberOfPlayers) throws Exception {
		super();
		
		if (numberOfPlayers < 1)
			throw new Exception("Number of players at a poker table needs to be 1 or more.");
		
		for (int x = 0; x < numberOfPlayers; x++) {
			String playerName = "Player " + x; 
			
			players.add(getBaseClassOfPlayer().getConstructor(String.class).newInstance(playerName)); 
		}
	}

	
	/**
	 * Removes a player from the table. 
	 * 
	 * @param index of the player you would like to remove
	 * @throws Exception is thrown if the supplied index is invalid. 
	 */
	public void removePlayer(int index) throws Exception {
		
		//	throw an exception if the index is out of range. 
		//	TODO: We need to investigate if this is nessary.  We might as well through the list error
		if ((index < 0) || (index > getnumberOfPlayersAtTable() - 1)) {
			throw new Exception ("Index [" + index + "] is out of range");
		}
		
		players.remove(index); 
	}
	

	/**
	 * Add another player to the table
	 * @param player
	 * @throws Exception is thrown if the player is not of the same type as the other players. 
	 */
	public void addPlayer(Player player) throws Exception { 
		
		//	do a simple test to ensure that this type of player is equal or is a sub class of the
		//	base class  
		if (!getBaseClassOfPlayer().isInstance(	player)) {
			throw new Exception("You are attempting to add a player of type [" + player.getClass().getCanonicalName() + "] that"
					+ " if supported by this table. Player must be of type [" + getBaseClassOfPlayer().getCanonicalName() + "]");
		}
			
		players.add(player);
	}


	/**
	 * This method deals cards to each player.
	 * @param numberOfCards is the number of cards that each player should have at the end of the deal.
	 * @throws Exception
	 */
	public void dealCards(int numberOfCards) throws Exception {
		
		//	shuffle the deck of cards a random number of times. 
		Integer randomSeconds = Calendar.getInstance().get(Calendar.SECOND);
		deckOfCards.shuffleTheDeck(randomSeconds);
		
		//	work throw the players and draw cards where required to meet the number
		// 	of cards required.  If you are simulating specific hands, it's likely
		// you've statically set some the players hands and they will not need more cards.
		for (Player player : players) { 
			for (int x = player.getHoleCards().size(); x < numberOfCards; x++) { 
				player.getHoleCards().add(deckOfCards.drawNextRandomCard()); 
			}
		}
		
	}


	/**
	 * @return the players the players that are currently sitting at the table. 
	 */
	public List<Player> getPlayers() {
		return players;
	}
	

	/**
  	 * @return the number of players currently seated at the table.
	 */
	public int getnumberOfPlayersAtTable() {
		return players.size(); 
	}


	/**
	 * @return the deck of cards that are associate with the table. 
	 */
	public Deck getDeckOfCards() {
		return deckOfCards;
	}

}
