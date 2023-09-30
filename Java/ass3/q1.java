import java.io.*;

class person
{
	String name;
	String add;
	person(String na,String a)
	{
		name=na;
		add=a;
	}
}
class student extends person
{
	String course[]=new String[5];
	String grade[]=new String[5];
	int n;
	student(String na,String a)
	{
		super(na,a);
	}
	void addc() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter number of Courses:");
		int q=Integer.parseInt(br.readLine());
		n=q;
		for(int i=0;i<n;i++)
		{
			int flag=0;
			System.out.println("\nEnter the course name:");
			course[i]=br.readLine();
			if(i>0)
			{
				int j=0;
				while(j<i)
				{
					if(course[i].equals(course[j]))
					{
						System.out.println("\nCourse already Exists!");
						i--;
						flag=1;
						break;
					}
					else
					{
						j++;
					}
				}
			}
			if(flag==0)
			{
				System.out.println("\nEnter the grade:");
				grade[i]=br.readLine();
			}
		}
	}
	void display() throws IOException
	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+add);
		System.out.println("Course are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(course[i]+"\t"+grade[i]);
		}
	}
}
class teacher extends person
{
	String courset[]=new String[5];
	int nu;
	teacher(String na,String a)
	{
		super(na,a);
	}
	void addco() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the number of Courses:");
		int q=Integer.parseInt(br.readLine());
		nu=q;
		for(int i=0;i<nu;i++)
		{
			System.out.println("\nEnter the Course name:");
			courset[i]=br.readLine();
			if(i>0)
			{
				int j=0;
				while(j<i)
				{
				        if(courset[i].equals(courset[j]))
					{
						System.out.println("\nCourses already Exists");
						i--;
						break;
					}
					else
					{
						j++;
					}
				}
			}
		}
	}
	void delete(teacher obj2[],int p)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int flag=0,flag1=0;
		for(int k=0;k<p;k++)
		{
			System.out.println("\nEnter teacher name:");
			String s=br.readLine();
			String r=obj2[k].name;
			if(r.equals(s))
			{
				flag=1;
				System.out.println("\nEnter the course name to be deleted:");
				String l=br.readLine();
				for(int i=0;i<obj2[k].nu;i++)
				{
					if(l.equals(obj2[k].courset[i]))
					{
						System.out.println("\nCourse deleted:"+obj2[k].courset[i]);
						obj2[k].courset[i]="";
						flag1=1;
					}
				}
			}
		}
		if(flag1==0)
		{
			System.out.println("\nCourse doesn't Exists!");
		}
		if(flag==0)
		{
			System.out.println("\nTeacher doesn't Exists!");
		}
	}
	void display()throws IOException
	{
		System.out.println("Name:"+name);
		System.out.println("Adress:"+add);
		System.out.println("Courses:"+courset);
		for(int i=0;i<nu;)
		{
			if(courset[i]=="")
			{
				i++;
			}
			else
			{
				System.out.println(courset[i]);
				i++;
			}
		}
		System.out.println("\n|--------------------------------------------------|");
	}
	void add(teacher obj2[],int p)throws IOException
	{
		int I;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the teacher name:");
		String s=br.readLine();
		int flag=0;
		for(int k=0;k<p;k++)
		{
			String r=obj2[k].name;
			if(r.equals(s))
			{
				flag=1;
				System.out.println("\nEnter the number of courses to be added:");
				I=Integer.parseInt(br.readLine());
				int a=obj2[k].nu;
				obj2[k].nu=obj2[k].nu+1;
				for(int i=a;i<obj2[k].nu;i++)
				{
					System.out.println("\nEnter the course name:");
					obj2[k].courset[i]=br.readLine();
					if(i>0)
					{
						int j=0;
						while(j<i)
						{
							if(obj2[k].courset[i].equals(obj2[k].courset[j]))
							{
								System.out.println("\nCourse already Exist!!");
								i--;
								break;
							}
							else
							{
								j++;
							}
						}
					}
				}
			}
		}
		if(flag==0)
		{
			System.out.println("\nTeacher doesn't Exists!!");
		}
	}
}
class q1
{
	public static void main(String[] args)throws IOException
	{
		int p,q,i,c,r;
		String names="",adds="";
		student[] obj=new student[10];
		teacher[] obj1=new teacher[10];
		teacher t=new teacher(names,adds);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("\nMenu\n1.Student\n2.Teacher\n3.Exit\n\nEnter your choice:");
			c=Integer.parseInt(br.readLine());
			switch(c)
			{
				case 1:System.out.println("\nEnter the number of students:");
				       p=Integer.parseInt(br.readLine());
				       for(i=0;i<p;i++)
				       {
					       System.out.println("Enter the name:");
					       names=br.readLine();
					       System.out.println("Enter the address:");
					       adds=br.readLine();
					       obj[i]=new student(names,adds);
					       obj[i].addc();
				       }
				       System.out.println("Student details are:-");
				       System.out.println("|---------------------------------------------------|");
				       for(i=0;i<p;i++)
				       {
					       obj[i].display();
					       System.out.println("|---------------------------------------------------|");
				       }
				       break;

				case 2:System.out.println("\nEnter the number of teachers:");
                                       p=Integer.parseInt(br.readLine());
                                       for(i=0;i<p;i++)
                                       {
                                               System.out.println("Enter the name:");
                                               names=br.readLine();
                                               System.out.println("Enter the address:");
                                               adds=br.readLine();
                                               obj1[i]=new teacher(names,adds);
                                               obj1[i].addco();
                                       }
                                       System.out.println("Teacher details are:-");
                                       System.out.println("|-----------------------------------------------------------|");
                                       for(i=0;i<p;i++)
                                       {
                                               obj[i].display();
                                       }
                                       do
				       {
					       System.out.println("\nMenu\n\n1.Add Courses\n2.Delete Course\n3.Display\n4.Press 4 for Exit\n\nEnter your choice:");
					       r=Integer.parseInt(br.readLine());
					       switch(r)
					       {
						       case 1:t.add(obj1,p);
							      break;
						       case 2:t.delete(obj1,p);
                                                              break;
						       case 3:System.out.println("Teacher details are:-");
                                                              System.out.println("|--------------------------------------------------------|");
                                                              for(i=0;i<p;i++)
                                                              {
                                                                      obj[i].display();
                                                              }
							      break;
					       }
				       }while(r!=4);
				       break;

			        case 3:System.exit(1);
			}
		}while(c<3 && c>0);
	}
}	

