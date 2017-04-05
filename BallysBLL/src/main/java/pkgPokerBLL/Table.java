package pkgPokerBLL;

import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	//	Change this from ArrayList to HashMap.
	
	private HashMap<UUID, Player> listOfPlayers;
	
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public Table AddPlayerToTable(Player p)
	{
		listOfPlayers.put(p.getPlayerID(), p);
		return this;
		
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		listOfPlayers.remove(p.getPlayerID());
		return this;
	}
}
