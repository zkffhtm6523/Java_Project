package com.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList<Card>();

	public CardDeck() {
		init();
	}
	public List<Card> getCardDeckArr() {
		return arr;
	}
	private void init() {
		for (int i = 0; i < Card.PATTERNS.length; i++) {
			for (int z = 1; z <= 13; z++) {
//				arr.add(new Card(Card.PATTERNS[i], getDeno(z)));
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(z); //getDeno 메서드 받아옴
				int point = getPoint(z);
				Card c = new Card(pattern, deno, point);//Card클래스가 여기서 사용된다.
				arr.add(c); //배열 추가
			}
		}
	}
	private int getPoint(int num) {
		return num > 10 ? 10 : num;
	}
	private String getDeno(int num) {
		switch (num) {
		case 1: return "A";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default: return String.valueOf(num);
		}
	}
	@Override
	public String toString() {
		for (Card c : arr) {
			System.out.println(c);
		}
		return "";
	}
	//카드 뽑기
	public Card getCard() {
		int r = (int) (Math.random() * arr.size());
		Card c = arr.get(r);
		arr.remove(r);
		return c;
	}
	//뽑고 남은 카드
	public void remainsCard() {
		System.out.println("-------덱에 남은 잔여 카드-------");
		System.out.println(getCardDeckArr());
	}
}
