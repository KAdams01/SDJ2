package collection;

public class ArrayStringList implements StringListADT {
	public final int DEFAULT_CAPACITY = 100;
	public String[] list;
	public int size;

	public ArrayStringList(int initialCapacity) {
		list = new String[initialCapacity];
		size = 0;
	}

	public ArrayStringList() {
		list = new String[DEFAULT_CAPACITY];
		size = 0;
	}

	@Override
	public void add(int index, String element) {
		if (size >= list.length || index > list.length) {
			throw new IllegalStateException();
		} else {
			String[] temp = new String[list.length];

			for (int i = 0; i <= index - 1; i++) {
				temp[i] = list[i];
			}
			for (int i = index; i < list.length - 1; i++) {
				temp[i + 1] = list[i];
			}
			temp[index] = element;
			list = temp;
		}
	}

	@Override
	public void add(String element) {
		list[size] = element;
		size++;
	}

	@Override
	public void set(int index, String element) {
		list[index] = element;
	}

	@Override
	public String get(int index) {
		return list[index];
	}

	@Override
	public String remove(int index) {

		return null;
	}

	@Override
	public String remove(String element) {

		return null;
	}

	@Override
	public int indexOf(String element) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(element))
				return i;
		}
		return -1;
	}

	@Override
	public boolean contains(String element) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(element))
				return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < list.length; i++) {
			if (size() == 0)
				return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		for (int i = 0; i < list.length; i++) {
			if (size() == list.length)
				return true;
		}
		return false;
	}

	@Override
	public int size() {
		int temp = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				temp++;
			}
		}
		return temp;
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < list.length; i++) {
			if (i < list.length - 1) {
				temp += list[i] + ", ";
			} else
				temp += list[i];
		}
		return temp;
	}

}
