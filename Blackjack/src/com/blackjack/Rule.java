package com.blackjack;

public class Rule {
	public static void whoisWin(Gamer gamer, Dealer dealer) {
		int failPoint = 21;
		int gPoint = gamer.getTotalPoint();
		int dPoint = dealer.getTotalPoint();
		System.out.println("----게이머 카드덱----");
		gamer.openCards();
		System.out.println("----딜러 카드덱----");
		dealer.openCards();
		if(gPoint == dPoint ||(gPoint > failPoint && dPoint > failPoint)) {
			System.out.println("비겼음");
		} else if((gPoint < failPoint && gPoint > dPoint) || dPoint > failPoint) {
			System.out.println("게이머 승");
		} else {
			System.out.println("딜러 승");
		}
	}
}