package pkgPokerBLL;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card(eRank.ACE,eSuit.CLUBS,1);
		System.out.println(c);
Hand h = new Hand();
 
		
		h.AddToCardsInHand(new Card(eSuit.JOKER, eRank.JOKER,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.JACK,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.KING,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE,1));
		for(Hand h1: h.ExplodeHands(h)){
			System.out.println(h1);
			System.out.println("");
		}
	}

}
