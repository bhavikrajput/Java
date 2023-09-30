package Series;
import java.util.Scanner;
import java.io.*;

public class Square
{
        public void square()
        {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter the number till which you want the square of the numbers: ");
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			System.out.print(i*i+" ");
		}

	}
}

