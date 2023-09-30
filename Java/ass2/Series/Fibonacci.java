package Series;
import java.io.*;
import java.util.Scanner;

public class Fibonacci
{
	public void fib()
	{
		int n1=0,n2=1,n3,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Fibonacci numbers you want: ");
		n = s.nextInt();
		System.out.print(n1+" "+n2);

		for(int i=2; i<n; i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}

	}
}
