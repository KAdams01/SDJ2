package collection;

public class CircularArrayTest<T>{
	private T[] list;
	private int front, rear;
	
	public CircularArrayTest(int initialCapacity) {
		list = (T[]) new Object[initialCapacity];
		front = 0;
		rear = 0;
	}

	public void add(int index, T element) {
		
	}

	public void enqueue(T element) {
		if(rear == list.length) {
			if(list[0] != null) {
				throw new IllegalArgumentException();
			}
			else {
				rear = 0;
				list[rear] = element;
				rear++;
			}
		}
		else if(list[rear%list.length] != null) {
			throw new IllegalArgumentException();
		}
		else {
		list[rear] = element;
		rear++;
		}
		}

	public void set(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public T removeIndex(int index) {
		T temp = (T) list[index];
		list[index] = null;
		return temp;
	}

	public T dequeue() {
		if(front == list.length) {
			front = 0;
		}
		T temp = (T) list[front];
		list[front] = null;
		front++;
		return temp;
	}

	public int indexOf(T element) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean contains(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
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
