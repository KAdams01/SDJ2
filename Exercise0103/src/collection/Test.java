package collection;

public class Test {

	public static void main(String[] args) {
		ArrayStringList arr1 = new ArrayStringList(5);
		arr1.add("Position1");
		arr1.add("Position2");
		arr1.add("Position3");
		arr1.add("Position4");
//		arr1.add("Position5");
		System.out.println(arr1.toString());
		arr1.add(1, "Testing");
		System.out.println(arr1.toString());

	}

}
