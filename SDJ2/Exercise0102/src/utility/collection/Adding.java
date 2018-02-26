package utility.collection;

public class Adding implements Runnable{
	String id;
	long sleepTime;
	StringQueueADT queue;
	
	public Adding(ArrayStringQueue queue, String id, long sleepTime) {
		this.queue = queue;
		this.id = id;
		this.sleepTime = sleepTime;
	}
	public void run() {
//		queue.enqueue("one");
//		queue.enqueue("two");
//		queue.enqueue("three");
//		queue.enqueue("four");
//		queue.enqueue("five");
		int name = queue.size();
		
		for(int i = 0; i < 6; i++) {
			queue.enqueue("i: "+ i);
			System.out.println(id + queue);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
