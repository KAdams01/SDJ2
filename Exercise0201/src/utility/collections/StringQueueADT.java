package utility.collections;

public interface StringQueueADT <T>
{
	public void enqueue(T element);
	public T dequeue();
	public T first();
	public int indexOf(T element);
	public boolean isEmpty();
	public int size();
}