package DS;
import java.io.*;
import java.util.Scanner;

public class Stack
{
        Scanner sc = new Scanner(System.in);
        String[] stack;
        int top;
	
	public Stack(int size)
	{
		stack = new String[size];
		top = -1;
	}

	public void push(String text)
	{
		if(top<stack.length-1)
                {
			stack[++top] = text;
                }
                else
                {
                        System.out.println("Stack Overflow!!");
                }
	}

	public String pop()
	{
		if( top>= 0)
		{
			return stack[top--];
		}
		else
		{
			return "Stack Underflow!!";
		}
	}

	public String peep()
	{
		if( top>= 0)
                {
                        return stack[top];
                }
                else
                {
                        return "Stack Underflow!!";
                }
	}

	public boolean isEmpty()
	{
		return top == -1;
	}

}
