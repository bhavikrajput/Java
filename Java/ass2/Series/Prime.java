package Series;
import java.util.Scanner;
import java.io.*;

public class Prime
{
	public void prime()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number till which you want the prime numbers: ");

		int n = s.nextInt();

		System.out.println("Prime numbers between 1 and "+n+" are: ");

		for(int i=2; i<=n; i++)
		{
			int count = 0;
			for(int j=1; j<=n; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
	}
}
