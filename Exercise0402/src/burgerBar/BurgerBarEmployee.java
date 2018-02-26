package burgerBar;

public class BurgerBarEmployee implements Runnable{
	String name;
	BurgerBar burgerBar;
	
	public BurgerBarEmployee(String name, BurgerBar burgerBar) {
		this.burgerBar = burgerBar;
		this.name = name;
	}

	@Override
	public void run() {
		int i = 0;
		while(i == 0 && burgerBar.isBurgerBarEmpty() == false) {
		try {
			burgerBar.makeBurger(name);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
