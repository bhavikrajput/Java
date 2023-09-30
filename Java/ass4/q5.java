import java.io.*;
class q5{
	public static void main(String args[])throws IOException{
		if(args.length==2){
			String str=args[0];
			String name=args[1];
			FileReader f2=new FileReader(name);
			BufferedReader b2=new BufferedReader(f2);
			String line;
			while((line=b2.readLine())!=null){
				if(line.indexOf(str)!=-1)
					System.out.println(line);
			}
		}
		if(args.length==3){
			String str=args[1];
			String line;
			int count=0;
			FileReader f2=new FileReader(args[2]);
			BufferedReader b2=new BufferedReader(f2);
			if(args[0].equals("c")){
				while((line=b2.readLine())!=null){
					if(line.indexOf(str)!=-1)
						count++;
				}
				System.out.println("Count Of Lines Containing The String Is : "+count);
			}
			if(args[0].equals("v")){
				System.out.println("The Line Not Contaning The String Are : ");
				while((line=b2.readLine())!=null){
					if(line.indexOf(str) == -1)
						System.out.println(line);
				}
			}
		}
		else if(args.length>3 || args.length<2)
			System.out.println("Invalid No. Of Arguments");
	}
}
