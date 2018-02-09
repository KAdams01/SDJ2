package utility.collection;

public class Test {

	public static void main(String[] args) 
	{
		ArrayQueue<String> queue = new ArrayQueue<String>(1);
		queue.enqueue("T 1");
		System.out.println(queue);
		queue.enqueue("T 2");
		System.out.println(queue.first());
		queue.dequeue();
		System.out.println(queue);
		System.out.println(queue.first());
		System.out.println(queue);
		System.out.println(queue.indexOf("T 2"));
		System.out.println("Is empty? : " + queue.isEmpty());
		queue.dequeue();
		System.out.println("Is empty? : " + queue.isEmpty());
		System.out.println("Size: " + queue.size());

	}

}
