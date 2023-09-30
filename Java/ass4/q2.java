import java.io.*;
import java.lang.*;

class InvalidEmailException extends Exception{
	String s;
	InvalidEmailException(String s){ //constructor
		this.s=s; //refer obj
	}
	public String toString(){
		return s;
	}
}

class q2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,cnt1=0,cnt2=0,l;
		char x,ch;
		System.out.println("Enter An Email");
		String s=br.readLine();
		l=s.length();
		try{
			ch=s.charAt(0);
			if(Character.isDigit(ch)){
				throw new InvalidEmailException("Email Can Not Start With Digit");
			}
			if(s.endsWith(".com.com")){
				throw new InvalidEmailException("Invalid Email");
			}
			for(i=0;i<l;i++){
				ch=s.charAt(i);
				if(ch=='@'){
					x=s.charAt(i-1);
					if(x=='.')
						throw new InvalidEmailException("Invalid Syntax");
					cnt2++;
				}
				if(ch=='.')
					cnt1++;
				if(ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')' || ch=='+' || ch=='-' ||ch=='=')
					throw new InvalidEmailException("invalid symbol used");
			}
			if(cnt1==0)
				throw new InvalidEmailException("INVALID EMAIL");
			if(cnt2==0 || cnt2>1)
				throw new InvalidEmailException("Invalid Number Of Symbols");
		}
		catch(InvalidEmailException e){
			System.out.println(e);
		}
	}
}
