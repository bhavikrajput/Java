import java.io.*;
import java.util.Scanner;
import Series.Prime;
import Series.Fibonacci;
import Series.Square;

class Series
{
	public static void main(String args[])
	{
		int ch;
		Prime p = new Prime();
		Fibonacci f = new Fibonacci();
		Square sq = new Square();

		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("1)Prime Series\n2)Fibonacci Series\n3)Square Series\n4)Exit");
			System.out.println("Enter your choice: ");
			System.out.println();
			
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					p.prime();
					break;
				case 2:
					f.fib();
					break;
				case 3:
					sq.square();
					break;
				case 4:
					System.out.println("Exiting..");
					break;
				default:
					System.out.println("Wrong input!");
					break;
			}
		}
		while(ch != 4);
	}
}
