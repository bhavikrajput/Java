package DS;

import java.util.Scanner;

public class Queue
{
	String[] queue;
	int front;
	int rear;
	int size;
	
	public Queue(int capacity)
	{
		queue = new String[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	public void add(String item)
	{
		if(size<queue.length)
		{
			rear = (rear+1) % queue.length;
			queue[rear] = item;
			size++;
		}
		else
		{
			System.out.println("Queue is full!");
		}
	}

	public String delete()
	{
		if(size>0)
		{
			String item = queue[front];
			front = (front+1) % queue.length;
			size--;
			return item;
		}
		else
		{
			return "Queue is empty!";
		}
	}

	public void display()
	{
		int currentIndex = front;
		for(int i=0; i<size; i++)
		{
			System.out.print(queue[currentIndex]+" ");
			currentIndex = (currentIndex+1) % queue.length;
		}
	}
}




