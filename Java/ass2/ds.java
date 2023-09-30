import DS.stack;
import DS.queue;
import java.util.Scanner;
class ds{
public static void main(String[] args){
	int ch,n,chq,cha,q;
	String a,b=" ";
	char c;
	Scanner sw=new Scanner(System.in);
	System.out.println("Enter size of the stack || Queue :");
			    n=sw.nextInt();
			    stack s=new stack(n);
	do{ 
		System.out.println("\n1.Print the string in reverse order using Stack");
	    System.out.println("2.Queue");
	    System.out.println("3.Exit");
	    System.out.println("Choose operation :");
	    cha=sw.nextInt();
	    
		switch(cha){
	    case 1:	System.out.println("Enter element to be pushed : ");
							a=sw.next();
							for(int i=0;i<a.length();i++)
							{
								c=a.charAt(i);
								s.push(c);
							}
			       	s.display();
               break;																	
      case 2:	queue qe=new queue();
         			do{
         					System.out.println("\n1.Insert");
         					System.out.println("2.Delete");
         					System.out.println("3.Display");
         					System.out.println("4.Exit");
         					System.out.print("Choose operation :");
         					chq=sw.nextInt();
         					switch(chq){
         					case 1:	System.out.print("Enter element :");
       									 	q=sw.nextInt();
        	 								qe.inqueue(q);
         									break;
         					case 2:
         									qe.dequeue();
         									break;
         					case 3:	qe.display();
         									break;
         					}
         			}while(chq<4);
         			break;
	   }
   }while(cha<3);
  }
}                      
				 
