package utility.collections;


public class BoundedArrayQueue<T> implements StringQueueADT<T> 
{
	private T[] queue;
	private int count;
	
	public BoundedArrayQueue(int capacity)
	{
		count = 0;
		this.queue = (T[]) new Object[capacity];
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
		if (count == queue.length)
			throw new IllegalStateException();
		else
		{
			queue[count] = element;
			count++;
		}
	}

	public T dequeue() 
	{
		if (count == 0)
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
		for (int i = 0; i < count; i++) 
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
}
