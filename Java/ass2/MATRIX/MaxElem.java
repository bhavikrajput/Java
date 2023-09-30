package MATRIX;
import java.io.*;
import java.util.Scanner;

public class MaxElem
{
	public void max()
	{
		Scanner s = new Scanner(System.in);
                System.out.println("Enter the number of rows: ");
                int m = s.nextInt();
                System.out.println("Enter the number of collumns: ");
                int n = s.nextInt();
                int[][] matrix = new int[m][n];
		
		System.out.println("Enter the elements in the matrix: ");

                for(int i=0; i<m; i++)
                {
                        for(int j=0; j<n; j++)
                        {
                                matrix[i][j] = s.nextInt();
                        }
                }

		
		System.out.println("The matrix is: ");
                for(int i=0; i<m; i++)
                {
                        for(int j=0; j<n; j++)
                        {
                                System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                }
		
		int maxi = -1;

		for(int i=0; i<m; i++)
                {
                        for(int j=0; j<n; j++)
                        {
                                if(maxi<matrix[i][j])
				{
					maxi = matrix[i][j];
				}
                        }
                }

		System.out.println("The max element is: "+ maxi);

	}
}
