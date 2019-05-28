package com.qa.blackjack;

public class BlackJack {
	public static void main(String[] args) {

	}

	public int play(int player, int dealer) {
		if (player < 31 && dealer < 31) {
			if (dealer < 16) {
				dealer += twist();
				if (player > dealer && player <= 21) {
					return player;
				} else if (dealer <= 21) {
					return dealer;
				}

			} else
				return 0;
		}
		return -1;
	}

	public int twist() {
		int newCard = ((int) (Math.random() * 11) + 1);
		if (newCard == 11) {
			return 1;
		}
		return newCard;
	}
}
