package za.org.poker.texas;

import za.org.poker.Player;
import za.org.poker.Table;

/**
 * This class is a representation of a texas hold'em table.  This class

 * @author Mark Horwell (f3632210)
 *
 */
public class TexasTable extends Table {

	private static final long serialVersionUID = -7147444285549415822L;
	
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


	public TexasTable(int numberOfPlayers, Class<? extends Player> playerClass)
			throws Exception {
		super(numberOfPlayers, playerClass);
	}


	public TexasTable(int numberOfPlayers)
			throws Exception {
		super(numberOfPlayers);
	}
	
	
}
