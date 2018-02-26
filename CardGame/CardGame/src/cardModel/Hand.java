package cardModel;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand;
	private CardsDeck cardDeck;
	
	public Hand(CardsDeck cD1) {
		cardDeck = cD1;
		hand = new ArrayList<Card>();
		hand.add(cardDeck.pullRandom());
		hand.add(cardDeck.pullRandom());
	}
	public ArrayList<Card> showHand() {
		return hand;
	}
	public void drawCard() {
		if(cardDeck.pullRandom() != null) {
		hand.add(cardDeck.pullRandom());
		}
		else {
			System.out.println("Error. End of Deck.");
		}
	}
	public int getTotalValue() {
		int temp = 0;
		for (int i = 0; i < hand.size(); i++) {
			if(hand.get(i).getValue() > 10) {
				temp += 10;
			}
			else {temp += hand.get(i).getValue();}
		}
		return temp;
	}
	public boolean checkWinCondition() {
		if(getTotalValue() <= 21) {
			return true;
		}
		return false;
	}

}
