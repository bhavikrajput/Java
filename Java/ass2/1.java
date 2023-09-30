import MATRIX.AccAndDisp;
import MATRIX.Addition;
import MATRIX.MaxElem;
import java.util.Scanner;
import java.io.*;

class matrix
{
        public static void main(String args[])
        {
                Scanner s = new Scanner(System.in);
		int ch;	
		AccAndDisp ad = new AccAndDisp();
		Addition a = new Addition();
		MaxElem m = new MaxElem();

		do
		{
			System.out.println();
			System.out.println("1)Accept and Display Matrix\n2)Addition of two matrices\n3)Max element of a matrix\n4)Exit");
			System.out.println("Enter your choice: ");
			System.out.println();

			ch = s.nextInt();

			switch(ch)
			{
				case 1:
					ad.AccAndDisp();
					break;
				case 2: 
					a.add();
					break;
				case 3:
					m.max();
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
