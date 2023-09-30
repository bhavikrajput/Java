import java.io.*;

abstract class shape
{
	float length;
	float width;
	shape (float l,float w)
	{
		length=l;
		width=w;
	}
	abstract void display();
	abstract void area();
}
class circle extends shape
{
	circle(float l,float w)
	{
		super(l,w);
	}
	void display()
	{
		System.out.println("Radius of circle is:"+length);
	}
	void area()
	{
		double a;
		a=3.14*length*length;
		System.out.println("\nThe area of circle is:"+a);
	}

}
class rectangle extends shape
{
	rectangle(float l,float w)
	{
		super(l,w);
	}
	void display()
	{
		System.out.println("Length of rectangle is:"+length);
		System.out.println("Width of rectangle is:"+width);
	}
	void area()
	{
		double a;
		a=length*width;
		System.out.println("\nThe area of rectangle is:"+a);
	}
}
class q2
{
	public static void main(String args[])throws IOException
	{
		float r,len,wid;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("Enter the radius of circle:");
			r=Float.parseFloat(br.readLine());
		}
		while(r<=0);
		circle obj1=new circle(r,1);
		obj1.display();
		obj1.area();
		do
		{
			System.out.println("Enter length and width of the rectangle:");
			len=Float.parseFloat(br.readLine());
			wid=Float.parseFloat(br.readLine());
		}
		while(len<=0||wid<=0);

		rectangle obj2=new rectangle(len,wid);
		obj2.display();
		obj2.area();
	}
}



