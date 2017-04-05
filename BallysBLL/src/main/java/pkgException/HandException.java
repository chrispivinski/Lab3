package pkgException;

import pkgPokerBLL.Deck;
import pkgPokerBLL.Hand;

public class HandException extends Exception {
		private Hand errorHand;

		public HandException(Hand errorHand) {
			super();
			this.errorHand = errorHand;
		}

		public Hand getErrorHand() {
			return errorHand;
		}
		
	}

