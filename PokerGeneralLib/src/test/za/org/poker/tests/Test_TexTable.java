package za.org.poker.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import za.org.poker.Player;
import za.org.poker.texas.TexasPlayer;
import za.org.poker.texas.TexasTable;

public class Test_TexTable {
	
	@Test
	public void test() throws Exception {
		
		//	Instantiate the Texas holdem table with 6 players. 
		TexasTable texasTable = new TexasTable(6);
		
		texasTable.dealCards();
		texasTable.dealFlop();
		texasTable.dealTheRiver();
		texasTable.dealTheTurn();
		
		System.out.println(texasTable);
		
		for (Player player : texasTable.getPlayers()) {
			System.out.println(player);
		}

	}

}
