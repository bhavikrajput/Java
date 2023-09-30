import java.io.*;
import java.lang.*;

class Mydate{
	int day;
	int month;
	int year;
	Mydate(int d,int m,int y){
		day=d;
		month=m;
		year=y;
	}
	void display(){
		System.out.println(day+"-"+month+"-"+year);
	}
}

class InvalidDayException extends Exception{
	public String toString(){
		return "Invalid Day";
	}
}

class InvalidMonthException extends Exception{
	public String toString(){
		return "Invalid Month";
	}
}

class InvalidYearException extends Exception{
	public String toString(){
		return "Invalid Year";
	}
}

class q1{
	public static void main(String args[]) throws IOException{
		int d=0,m=0,y=0,l,flag=0;
		try{
			l=args.length;
			if(l!=3){
				throw new NullPointerException();
			}
			d=Integer.parseInt(args[0]);
			m=Integer.parseInt(args[1]);
			y=Integer.parseInt(args[2]);
			if(y%400==0 || y%4==0 && y%100!=0)
				flag=1;
			if(y<0)
				throw new InvalidYearException();
			if(m<1 || m>12)
				throw new InvalidMonthException();
			switch(m){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:if(d<1 || d>31)
					throw new InvalidDayException();
					break;
				case 4:
				case 6:
				case 9:
				case 11:if(d<1 || d>30)
					throw new InvalidDayException();
					break;
				case 2:if(flag==1 && d>29)
					throw new InvalidDayException();
				       if(flag==0 && d>29)
					throw new InvalidDayException();
				       break;
			}
		}
		catch(Exception e){
			l=1;
			System.out.print(e);
		}
		if(l!=1){
			Mydate date=new Mydate(d,m,y);
			date.display();
		}
	}
}
