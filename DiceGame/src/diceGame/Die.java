package diceGame;

public class Die {
	private int value;
	
	public Die() {
		this.value = 0;
	}
	
	public int roll() {
		value = (int) Math.ceil(Math.random() * 6); 
		return value;
	}
	
	public int getValue() {
		return this.value;
	}
	

	// tester method
	/*
	public static void main(String[] args) {
		Die d = new Die();
		
		d.roll();
		System.out.println("Roll successful! value: " + d.roll());
		d.roll();
		System.out.println("Roll successful! value: " + d.roll());
	}
	
	*/
}
