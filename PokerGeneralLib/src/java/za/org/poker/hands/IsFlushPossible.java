package za.org.poker.hand.possibility;

import java.util.List;

import za.org.poker.Card;

public class IsFlushPossible extends HandPossiblity {

	private static final int NUMBER_OF_CARDS_IN_A_FLUSH = 5;
	
	public IsFlushPossible(List<Card> visibleCards, int numberOfcardsToBeDrawn)
			throws Exception {
		super(visibleCards, numberOfcardsToBeDrawn);
	}

	@Override
	public boolean isPossible() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
