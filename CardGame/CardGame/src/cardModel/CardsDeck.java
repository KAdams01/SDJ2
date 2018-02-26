package cardModel;

import java.util.ArrayList;
import java.util.Random;

public class CardsDeck {
	private ArrayList<Card> mCards;
	private ArrayList<Card> mPulledCards;
	private Random mRandom;

	public static enum Suit {
		SPADES, HEARTS, DIAMONDS, CLUBS;
	}

	public static enum Rank {
		ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

        private final int value;

        Rank(final int newValue) {
            value = newValue;
        }

        public int getValue() { return value; 
	}
	}

	public CardsDeck() {
		mRandom = new Random();
		mPulledCards = new ArrayList<Card>();
		mCards = new ArrayList<Card>(Suit.values().length * Rank.values().length);
		reset();
	}

	public void reset() {
		mPulledCards.clear();
		mCards.clear();
		/* Creating all possible cards... */
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				Card c = new Card(s, r);
				mCards.add(c);
			}
		}
	}

	public Card pullRandom() {
		if (mCards.isEmpty())
			return null;

		Card res = mCards.remove(randInt(0, mCards.size() - 1));
		if (res != null)
			mPulledCards.add(res);
		return res;
	}

	public Card getRandom() {
		if (mCards.isEmpty())
			return null;

		Card res = mCards.get(randInt(0, mCards.size() - 1));
		return res;
	}

	public int randInt(int min, int max) {
		int randomNum = mRandom.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public boolean isEmpty() {
		return mCards.isEmpty();
	}
}