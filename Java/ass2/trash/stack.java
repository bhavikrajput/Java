package DS;
import java.io.*;
import java.util.Scanner;

public class stack
{
	Scanner sc = new Scanner(System.in);
	char[] charac;
	int top;
	int size;

	public void push(char c)
	{
		c = sc.next().charAt(0);
		if(top>size)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top = top + 1;
			charac[top] = c;
			System.out.println("Element added");
		}
	}

	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty!");
		}
		else
		{
			top = top - 1;
			System.out.println("Element "+ charac[top] + " is popped");
		}
	}

	public void peek()
	{
		System.out.println("Element at the top is: " + charac[top]);
	}

	public void disp()
	{
		for(int i=0; i<charac.lenght(); i++)
		{
			System.out.println(charac[i]);
		}
	}

	/*
	boolean isFull()
	{
		return top >= limit-1;
	}*/

	boolean isEmpty()
	{
		return top<0;
	}
}
