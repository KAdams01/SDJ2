package collection;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>(5);
//		arr1.add(1);
//		arr1.add(2);
//		arr1.add(3);
//		arr1.add(4);
//		arr1.add(5);
		System.out.println(arr1.toString());
		arr1.add(2, 301);
		arr1.add(3, 301);
		System.out.println(arr1.toString());
		arr1.remove(301);
		System.out.println(arr1.toString());

	}

}
