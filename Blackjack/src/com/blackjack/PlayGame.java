package com.blackjack;

public class PlayGame {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		
		for (int i = 0; i < 2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		dealer.moreCards(cd);
		gamer.moreCards(cd);
//		cd.remainsCard();
		Rule.whoisWin(gamer, dealer);
		
	}
}
