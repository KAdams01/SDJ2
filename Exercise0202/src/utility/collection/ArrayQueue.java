package utility.collection;

public class ArrayQueue<T> implements QueueADT<T> 
{
	private final int DEFAULT_CAPACITY = 100;
	private T[] queue;
	private int count;
	
	public ArrayQueue(int initialCapacity)
	{
		count = 0;
		queue = (T[]) new Object[initialCapacity];
	}
	
	public ArrayQueue()
	{
		count = 0;
		queue = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	public String toString()
	{
		String s = "";
		for (int i = 0; i < queue.length; i++) 
		{
			s+= queue[i] + ", ";
		}
		return s;
	}

	public void enqueue(T element) 
	{
		if(count == queue.length)
		{
			expandCapacity();
			queue[count] = element;
			count++;
		}
		
		else
		{
			queue[count] = element;
			count++;
		}
		
	}

	public T dequeue()
	{
		if(count == 0)
			throw new IllegalStateException();
		else
		{
			T temporary = queue[0];
			queue[0] = null;
			count--;
			for (int i = 0; i < queue.length - 1; i++)
			{
				queue[i] = queue[i + 1];
			}
			queue[queue.length - 1] = null;
			return temporary;
		}
	}

	public T first() 
	{
		if (count == 0)
			throw new IllegalStateException();
		else
			return queue[0];
	}

	public int indexOf(T element) 
	{
		for (int i = 0; i < queue.length; i++) 
		{
			if(queue[i].equals(element))
				return i;
		}
		
		return -1;
	}

	public boolean isEmpty()
	{
		return count == 0;
	}

	public int size() 
	{
		return count;
	}
	
	public void expandCapacity()
	{
		T[] temp;
	    temp = queue = (T[]) new Object[queue.length + 10];
		for (int i = 0; i < queue.length; i++)
		{
			temp[i] = queue[i];
		}
		
		queue = temp;
	}
	
	
}
