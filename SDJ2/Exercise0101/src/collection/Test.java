package collection;

public class Test {

	public static void main(String[] args) 
	{
		BoundedArrayStringQueue queue = new BoundedArrayStringQueue(10);
		/*queue.enqueue("String 1");
		System.out.println(queue);
		queue.enqueue("String 2");*/
		System.out.println(queue.first());
		/*System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		System.out.println(queue.first());
		System.out.println(queue);
		System.out.println(queue.indexOf("String 3"));
		System.out.println("Is empty? : " + queue.isEmpty());
		queue.dequeue();
		System.out.println("Is empty? : " + queue.isEmpty());
		System.out.println("Size: " + queue.size());*/

	}

}