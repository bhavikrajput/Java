import java.io.*;
interface stack
{
	int maxsize=15;
	abstract void push(char c);
	abstract char pop();
	abstract boolean isempty();
	abstract boolean isfull();
	abstract void peek();
}
class check implements stack
{
	int top;
	char data[]=new char[stack.maxsize];
	check()
	{
		top=-1;
	}
	public void push(char c)
	{
		top++;
		data[top]=c;
	}
	public char pop()
	{
		char a;
		a=data[top];
		top--;
		return a;
	}
	public boolean isempty()
	{
		if(top==1)
			return true;
		else
			return false;
	}
	public boolean isfull()
	{
		if(top==(stack.maxsize-1))
			return true;
		else 
			return false;
	}
	public void peek()
	{
		System.out.println("The peeked element is:"+data[top]);
	}
}
class q3
{
	public static void main(String args[])throws IOException
	{
		String s;
		char t[]=new char[25];
		char a;
		check obj1=new check();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		s=br.readLine();
		for(int i=0;i<s.length();i++)
		{
			obj1.push(s.charAt(i));
		}
			obj1.peek();
			if(obj1.isempty()!=true)
			{
				for(int j=0;j<s.length();j++)
				{
					t[j]=obj1.pop();
					a=s.charAt(j);
					if(a!=t[j])
					{
						System.out.println(s+" Is not palindrome");
						System.exit(1);
					}
				}
				System.out.println(s+" Is palindrome");
			}
			else
				System.out.println("Stack is empty");
		}
	}



