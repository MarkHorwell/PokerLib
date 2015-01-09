package za.org.poker.texas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import za.org.poker.Card;
import za.org.poker.Player;


/**
 * This class represents a Texas Holdem player.
 * 
 * @author Mark Horwell (f3632210)
 */
public class TexasPlayer extends Player {

	private static final long serialVersionUID = -4543151729452375130L;

	//	the maximum number of a cards that a texas holdem player may have is 2.
	private static final int MAX_NUMBER_OF_HOLE_CARDS = 2;
	
	private List<Card> holeCards = new ArrayList<Card>();
	
	/**
	 * Default constructor.
	 * @param name / description of the player
	 */
	public TexasPlayer(String name) {
		super(name);
	}

	
	@Override
	public List<Card> getHoleCards() {
		return holeCards;
	}

}
