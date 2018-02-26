package burgerBar;

public class BurgerBarTest {

	public static void main(String[] args) {
		BurgerBar bB1 = new BurgerBar(10);
		BurgerBarEmployee bBEmp1 = new BurgerBarEmployee("James", bB1);
		BurgerBarEmployee bBEmp2 = new BurgerBarEmployee("Bob", bB1);
		
		BurgerBarCustomer bBCust1 = new BurgerBarCustomer("Fred", bB1, 1);
		BurgerBarCustomer bBCust2 = new BurgerBarCustomer("Jill", bB1, 1);
		BurgerBarCustomer bBCust3 = new BurgerBarCustomer("Mark", bB1, 1);
		BurgerBarCustomer bBCust4 = new BurgerBarCustomer("Guy", bB1, 1);
		BurgerBarCustomer bBCust5 = new BurgerBarCustomer("Amy", bB1, 1);
		
		
		Thread t1 = new Thread(bBEmp1);
		Thread t2 = new Thread(bBEmp2);
		Thread t3 = new Thread(bBCust1);
		Thread t4 = new Thread(bBCust2);
		Thread t5 = new Thread(bBCust3);
		Thread t6 = new Thread(bBCust4);
		Thread t7 = new Thread(bBCust5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();

	}

}
