package diceGame;

public class Player {
	private int score;
	private String name;
	
	public Player(String name) {
		this.name=name;
		score=0;
	}
	public void setScore(int score) {
		this.score=score;
	}
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name + "'s score: " + score;
	}

}
