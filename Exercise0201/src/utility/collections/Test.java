package utility.collections;

public class Test {

	public static void main(String[] args) {
		int test = 1;
		BoundedArrayQueue<Integer> queue1 = new BoundedArrayQueue<Integer>(10);
		queue1.enqueue(test);
		System.out.println(queue1);

	}

}
