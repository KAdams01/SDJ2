package burgerBar;

public class BurgerBarCustomer implements Runnable{
	private int burgersToEat;
	private String name;
	BurgerBar burgerBar;
	
	public BurgerBarCustomer(String name, BurgerBar burgerBar, int burgersToEat) {
		this.burgersToEat = burgersToEat;
		this.name = name;
		this.burgerBar = burgerBar;
	}

	@Override
	public void run() {
		while(burgersToEat > 0) {
			if(burgerBar.getNumberOfBurgers() > 0) {
			try {
				burgerBar.eatBurger(name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			burgersToEat--;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(burgersToEat == 0) {
			burgerBar.isEmpty();
		}
		
	}

}
