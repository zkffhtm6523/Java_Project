package com.blackjack;

public class Dealer extends Gamer {
	@Override
	public void moreCards(CardDeck cd) {
		// 딜러가 가지고 있는 카드의 합계점수가 17점 이상이 될 때 까지 카드 뽑기
		int stopPoint = 17;
		while(getTotalPoint() < stopPoint) {
			receiveCard(cd.getCard());
		}
	}
	
}