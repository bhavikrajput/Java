import java.io.*;
class q6{
	public static void main(String args[])throws IOException{
		if(args.length==1){
			int flag=0,c=0,price=0,qty=0;
			RandomAccessFile raf=new RandomAccessFile(args[0],"r");
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			do{
				System.out.println("Menu\n1.Search For Specific Book\n2.Find Costliest Book\n3.Display All The Books & Total Cost\n4.Exit");
				System.out.println("Enter Your Choice: ");
				c=Integer.parseInt(br.readLine());
				switch(c){
					case 1:
						String line;
						System.out.println("Enter Name Of Book:");
						String s=br.readLine();
						while((line=raf.readLine())!=null){
							String tok[]=line.split(" ");
							if(s.equals(tok[1])){
								flag=1;
								System.out.println("Book Details Are : "+line);
							}
							if(flag==0)
								System.out.println("Book Name Not Found!!");
						}
						raf.seek(0);
						break;
					
					case 2:
						String book1="";
						int maxc=0;
						while((line=raf.readLine())!=null){
							String tok[]=line.split(" ");
							price = Integer.parseInt(tok[2]);
							if(price>maxc){
								maxc=price;
								book1=line;
							}
						}
						System.out.println("The Book With Maximum Cost Is: "+book1);
						raf.seek(0);
						break;
					case 3:
						int totalc=0;
						System.out.println("Details Of Book: ");
						while((line=raf.readLine())!=null){
							String tok[]=line.split(" ");
							System.out.println(line);
							price = Integer.parseInt(tok[2]);
							qty = Integer.parseInt(tok[3]);
							totalc = (price*qty);
							System.out.println("Total Cost Of Book Is : "+totalc);
						}
						raf.seek(0);
						break;

					case 4:
						System.exit(1);
				}
			}while(c<=4);
		}
		else
			System.out.println("Invalid Number Of Arguments !!");
	}
}
