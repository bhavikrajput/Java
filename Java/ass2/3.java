import DS.Stack;
import DS.Queue;
import java.util.Scanner;
import java.io.*;

class dsa
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch;
		
		/*
		Stack stack = new Stack(20);
		String inputString = "Hello ,World";
		
		char[] characters = inputString.toCharArray();
		for(char c: characters)
		{
			stack.push(String.valueOf(c));
		}

		char[] reversedCharacters  = new char[characters.length];
		int index = 0;
		while(!stack.isEmpty())
		{
			reversedCharacters[index++] = stack.pop().charAt(0);
		}

		String reversedString = new String(reversedCharacters); 
		System.out.println("Reversed String: " + reversedString);
		*/
		
		/*
		Queue queue = new Queue(10);

		for(int i=0; i<11; i++)
		{
			String inputString = sc.next();
			queue.add(inputString);
		}

		queue.display();
		*/

		do
		{
			
			System.out.println();
			System.out.println("1)Reverse a string\n2)Queue\n3)Exit");
			System.out.println("Enter your choice: \n");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.println("Enter the string: ");
					String s = sc.next();

					Stack stack = new Stack(100);
                			String inputString = s;

                			char[] characters = inputString.toCharArray();
                			for(char c: characters)
                			{
                       				stack.push(String.valueOf(c));
                			}

                			char[] reversedCharacters  = new char[characters.length];
                			int index = 0;
                			while(!stack.isEmpty())
                			{
                        			reversedCharacters[index++] = stack.pop().charAt(0);
                			}

                			String reversedString = new String(reversedCharacters);
                			System.out.println("Reversed String: " + reversedString);
					break;
					
				case 2:
					System.out.println("Enter the size of the Queue you want: ");
					int size = sc.nextInt();
					Queue queue = new Queue(size);
					
					System.out.println("Enter the elemets to be added in the Queue: ");
                			for(int i=0; i<size ; i++)
                			{
                        			String inputString1 = sc.next();
                        			queue.add(inputString1);
                			}

					System.out.println();
					System.out.println("Displaying the queue: ");
                			queue.display();
					
					System.out.println();
					queue.delete();
					
					System.out.println();
					System.out.println("After deletion of an element: ");
					queue.display();

					break;
				case 3:
					System.out.println("Exiting the program...");
					break;
				default:
					System.out.println("Wrong Input");
					break;	
			}
		}
		while(ch != 3);
		
	}
}
