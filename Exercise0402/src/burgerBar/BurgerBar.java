package burgerBar;

public class BurgerBar {
	private int numberOfBurgers;
	private int maxNumberOfBurgers;
	private int isEmptyCount = 0;
	private boolean isEmpty;

	public BurgerBar(int maxNumberOfBurgers) {
		numberOfBurgers = 0;
		this.maxNumberOfBurgers = maxNumberOfBurgers;
	}

	public synchronized void makeBurger(String employeeName) throws InterruptedException {
		while (numberOfBurgers >= maxNumberOfBurgers) {
			
			try {
				wait();
			} catch (InterruptedException e) {

			}


		}
		Thread.sleep(1000);
		numberOfBurgers++;
		System.out
		.println(employeeName + " just made a burger(there are now " + numberOfBurgers + " burgers left)");
		notifyAll();

	}

	public synchronized void eatBurger(String who) throws InterruptedException {
		while (numberOfBurgers == 0) {
			
			try {
				wait();
			} catch (InterruptedException e) {

			}
			
			notifyAll();
		}
		Thread.sleep(1000);
		numberOfBurgers--;
		System.out.println(who + " just ate a burger(" + numberOfBurgers + " left)");
	}

	public synchronized int getNumberOfBurgers() {
		return numberOfBurgers;
	}
	public boolean isBurgerBarEmpty() {
		return isEmpty;
	}
	public void isEmpty() {
		isEmptyCount++;
		if(isEmptyCount == 3) {
			isEmpty = true;
		}
	}

}
