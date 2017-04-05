package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;

	private ArrayList<Player> GamePlayers;

	public Game() {
		super();
		GameID = UUID.randomUUID();
	}

	public UUID getGameID() {
		return GameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}
	
	public void addPlayerToTable (Table t, Player p) {
		t.AddPlayerToTable(p);
	}
	
	
}
