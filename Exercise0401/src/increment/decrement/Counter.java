package increment.decrement;

public class Counter {

	long value, max, min;

	public Counter(long min, long max) {
		this.min = min;
		this.max = max;
		value = 0;
	}

	public synchronized void increment() {
		while (value >= max) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		value++;
		notifyAll();
		System.out.println(value + ": " + Thread.currentThread().getName());

	}

	public synchronized void decrement() {
		while (value <= min) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		value--;
		notifyAll();
		System.out.println(value + ": " + Thread.currentThread().getName());

	}

	public synchronized long getValue() {
		return value;
	}

}
