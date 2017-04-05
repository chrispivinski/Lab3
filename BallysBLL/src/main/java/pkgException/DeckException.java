package pkgException;

import pkgPokerBLL.Deck;

public class DeckException extends Exception {
	private Deck errorDeck;

	public DeckException(Deck errorDeck) {
		super();
		this.errorDeck = errorDeck;
	}

	public Deck getErrorDeck() {
		return errorDeck;
	}
	
}
