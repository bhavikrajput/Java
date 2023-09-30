package MATRIX;
import java.io.*;
import java.util.Scanner;

public class Addition
{	
	public void add()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows of the matrices: ");
		int m = s.nextInt();
		System.out.println("Enter the number of collums of the matrices: ");
		int n = s.nextInt();

		int[][] mat1 = new int[m][n];
		int[][] mat2 = new int[m][n];

		System.out.println("Enter the elements of the first matrix: ");
		for(int i=0; i<m; i++)
              	{
                        for(int j=0; j<n; j++)
                        {
              	                mat1[i][j] = s.nextInt();
        	        }
	        }

		System.out.println("Enter the elements of the second matrix: ");
                for(int i=0; i<m; i++)
                {
                        for(int j=0; j<n; j++)
                        {
                                mat2[i][j] = s.nextInt();
                        }
                }
		
		System.out.println("The addition of both the  matrices are: ");
                for(int i=0; i<m; i++)
                {
                        for(int j=0; j<n; j++)
                        {
                                System.out.print(mat1[i][j]+mat2[i][j] + " ");
                        }
                        System.out.println();
                }
	}	
}

