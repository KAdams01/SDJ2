package increment.decrement;

public class TestMain {

	public static void main(String[] args) {
		Counter count1 = new Counter(0,10);
		CounterIncrementer cIncr1 = new CounterIncrementer(count1, 200);
		CounterIncrementer cIncr2 = new CounterIncrementer(count1, 200);
		CounterDecrementer cDecr1 = new CounterDecrementer(count1, 200);
		CounterDecrementer cDecr2 = new CounterDecrementer(count1, 200);
		Thread t1 = new Thread(cIncr1);
		Thread t2 = new Thread(cIncr2);
		Thread t3 = new Thread(cDecr1);
		Thread t4 = new Thread(cDecr2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	}

}
