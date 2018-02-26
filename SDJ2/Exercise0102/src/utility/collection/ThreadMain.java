package utility.collection;

public class ThreadMain{

	public static void main(String[] args){
		ArrayStringQueue test = new ArrayStringQueue();
		Adding adding = new Adding(test, "1", 1000);
		Adding adding1 = new Adding(test, "1", 1000);
		Adding adding2 = new Adding(test, "1", 1000);
		
		Thread showQueue = new Thread(adding);
		Thread showQueue1 = new Thread(adding1);
		Thread showQueue2 = new Thread(adding2);
		
		showQueue.start();
		showQueue1.start();
		showQueue2.start();
		System.out.println("ENDED");
		
		

	}

}
