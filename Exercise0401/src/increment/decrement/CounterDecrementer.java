package increment.decrement;

public class CounterDecrementer implements Runnable{
	
	private int updates;
	private Counter counter;
	
	public CounterDecrementer(Counter counter, int updates) {
		this.updates = updates;
		this.counter = counter;
	}

	@Override
	public void run() {
		while(counter.getValue() <= updates) {
			counter.decrement();
		}
		System.out.println(counter.getValue());
	}

}
