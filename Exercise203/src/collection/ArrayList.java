package collection;

public class ArrayList<T> implements ListADT<T> {
	public final int DEFAULT_CAPACITY = 100;
	public T[] list;
	public int size;

	public ArrayList(int initialCapacity) {
		list = (T[])new Object[initialCapacity];
		size = 0;
	}

	public ArrayList() {
		list = (T[])new Object[DEFAULT_CAPACITY];
		size = 0;
	}

	@Override
	public void add(int index, T element) {
		if (size == list.length || index > list.length) {
			throw new IllegalStateException();
		} else {
			T[] temp = (T[])new Object[list.length];

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
	public void add(T element) {
		list[size] = element;
		size++;
	}

	@Override
	public void set(int index, T element) {
		list[index] = element;
	}

	@Override
	public T get(int index) {
		return list[index];
	}

	@Override
	public T removeIndex(int index) {
		T temp = list[index];
		list[index] = null;
		for (int j = index; j < list.length - 1; j++) {
			list[j] = list[j+1];
		}
		list[list.length-1] = null;
		return temp;
	}

	@Override
	public T remove(T element) {
		int int1 = indexOf(element);
		T temp = null;
		for (int i = 0; i < list.length; i++) {
			if(list[i] != null && list[i].equals(element)) {
				temp = list[i];
				list[i] = null;
			}
		}
		for (int j = int1; j < list.length - 1; j++) {
			list[j] = list[j+1];
		}
		list[list.length-1] = null;
		return temp;
	}

	@Override
	public int indexOf(T element) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null && list[i].equals(element))
				return i;
		}
		return -1;
	}

	@Override
	public boolean contains(T element) {
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
