package diceGame;

import java.util.Scanner;

public class Game {
	static int infinite = 0;
	static Player player1 = new Player("Player1");
	static Player player2 = new Player("Player2");
	static Die dice1 = new Die();
	static boolean draw = false;
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {

		while (infinite == 0) {
			turn();
		}
	}

	public static void turn() throws InterruptedException {
		int temp1 = player1.getScore();
		int temp2 = player2.getScore();
		player1.setScore(temp1 += dice1.roll());
		System.out.println(
				player1.getName() + " rolled a --" + dice1.getValue() + "-- and has a total of: " + player1.getScore());
		player2.setScore(temp2 += dice1.roll());
		System.out.println(
				player2.getName() + " rolled a --" + dice1.getValue() + "-- and has a total of: " + player2.getScore());
		System.out.println("");
		Thread.sleep(1000);
		checkWinCondition();
	}

	public static void checkWinCondition() throws InterruptedException {
		if (player1.getScore() >= 30 && player2.getScore() >= 30) {
			System.out.println("Draw!");
			draw = true;
			infinite++;
			restartGame();
		} else if (draw == false) {
			if (player1.getScore() >= 30 && player2.getScore() < 30) {
				System.out.println(player1.getName() + " wins with a score of " + player1.getScore());
				infinite++;
				restartGame();
			}
			if (player2.getScore() >= 30 && player1.getScore() < 30) {
				System.out.println(player2.getName() + " wins with a score of " + player2.getScore());
				infinite++;
				restartGame();
			}
		}
	}

	public static void restartGame() throws InterruptedException {

		System.out.println("Would you like to play again? Y/N");
		String temp = keyboard.nextLine();

		if (temp.equalsIgnoreCase("Y")) {
			player1.setScore(0);
			player2.setScore(0);
			infinite = 0;
			turn();
		} else if (temp.equalsIgnoreCase("N")) {
			for (int i = 3; i > 0; i--) {
				System.out.println("Exitting programme in... " + i);
				Thread.sleep(1000);
			}
			System.exit(0);
		} else {
			for (int i = 3; i > 0; i--) {
				System.out.println("Invalid input, exitting programme in... " + i);
				Thread.sleep(1000);
			}
			System.exit(0);
		}
	}
}
