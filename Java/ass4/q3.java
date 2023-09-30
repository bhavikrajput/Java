import java.io.*;
import java.lang.*;

class q3{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A[],n,i,sum=0;
		System.out.println("Enter The Number Of Elements");
		n=Integer.parseInt(br.readLine());
		A=new int[n];
		try{
			System.out.println("Enter The Elements");
			for(i=0;i<n+1;i++){
				A[i]=Integer.parseInt(br.readLine());
						sum=sum+A[i];
			}
			System.out.println("Average="+(sum/n));
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Exception Caught: "+a);
		}
		catch(ArithmeticException ae){
			System.out.println("Exception Caught: "+ae);
		}
		catch(NumberFormatException ne){
			System.out.println("Exception Caught: "+ne);
		}
	}
}
