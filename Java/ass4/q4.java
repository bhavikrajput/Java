import java.io.*;
import java.util.*;

class q4{
	public static void main(String ss[]){
		Scanner sc= new Scanner(System.in);
		String name=ss[0];
		int c=0,count=0;
		File fp=new File(name);

		if(fp.isFile()){
			System.out.println(name + " Is A File");
			String p=fp.getAbsolutePath();
			System.out.println("Path Is : "+p);
			long l=fp.length();
			System.out.println("Length of Contents : "+l);
			long r=fp.lastModified();
			System.out.println("Last Modified Is :"+r);
		}
		else if(fp.isDirectory()){
			System.out.println(name+ " Is A DIRECTORY");
			String a[]=fp.list();
			System.out.println("Contents Of The Directory Are: ");
			for(int i=0;i<a.length-1;i++){
				File fp1=new File(name,a[i]);
				System.out.println(a[i]);
				if(fp1.isFile()){
					count++;
					if(a[i].endsWith(".txt")){
						System.out.println("Do You Want To Delete This File [1-YES/0-NO].");
						c=sc.nextInt();
						if(c==1){
							fp1.delete();
							count--;
						}
					}
				}
			}

			System.out.println("The Count Of The File In The Directory Is : "+count);
		}
	}
}
