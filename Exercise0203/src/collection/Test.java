package collection;

public class Test {

	public static void main(String[] args) {
//		ArrayList<Integer> arr1 = new ArrayList<Integer>(5);
//		arr1.add(1);
//		arr1.add(2);
//		arr1.add(3);
//		arr1.add(4);
//		arr1.add(5);
//		System.out.println(arr1.toString());
//		arr1.remove(Integer.valueOf(1));
//		arr1.add(301);
////		arr1.add(3, 301);
//		System.out.println(arr1.toString());
//		arr1.remove(301);
//		System.out.println(arr1.toString());
		
		CircularArrayTest<String> arr1 = new CircularArrayTest<String>(5);
		arr1.enqueue("First");
		arr1.enqueue("Second");
		arr1.enqueue("Third");
		arr1.enqueue("Fourth");
		arr1.enqueue("Fifth");
		arr1.dequeue();
		arr1.enqueue("Sixth");
//		arr1.dequeue();
//		arr1.enqueue("Seventh");
//		arr1.dequeue();
//		arr1.enqueue("Eighth");
//		arr1.dequeue();
//		arr1.enqueue("Ninth");
//		arr1.dequeue();
//		arr1.enqueue("Tenth");
//		arr1.dequeue();
//		arr1.dequeue();
//		arr1.enqueue("Eleventh");
//		arr1.enqueue("Twelth");
//		arr1.dequeue();
//		arr1.dequeue();
//		arr1.dequeue();
//		arr1.dequeue();
//		arr1.dequeue();
//		arr1.enqueue("test");
//		arr1.enqueue("test2");
		System.out.println(arr1);

	}

}
