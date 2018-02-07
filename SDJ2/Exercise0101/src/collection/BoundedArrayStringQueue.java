package collection;

public class BoundedArrayStringQueue implements StringQueueADT 
{
	private String[] queue;
	private int count;
	
	public BoundedArrayStringQueue(int capacity)
	{
		count = 0;
		this.queue = new String[capacity];
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

	public void enqueue(String element) 
	{
		if (count == queue.length)
			throw new IllegalStateException();
		else
		{
			queue[count] = element;
			count++;
		}
	}

	public String dequeue() 
	{
		if (count == 0)
			throw new IllegalStateException();
		else
		{
		String temporary = queue[0];
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
	
	public String first() 
	{
		if (count == 0)
			throw new IllegalStateException();
		else
			return queue[0];
		
	}

	public int indexOf(String element) 
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
