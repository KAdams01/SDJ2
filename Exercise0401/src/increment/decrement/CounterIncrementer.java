package increment.decrement;

public class CounterIncrementer implements Runnable{
	
	private int updates;
	private Counter counter;
	
	public CounterIncrementer(Counter counter, int updates) {
		this.updates = updates;
		this.counter = counter;
	}

	@Override
	public void run() {
		while(counter.getValue() <= updates) {
			counter.increment();
		}
		System.out.println(counter.getValue());
	}

}
