#include<stdio.h>
#include<stdlib.h>
#include<string.h>
//Structure declaration
struct instruction
{
	char line[80];
	//int lc;
	struct instruction *next;
};


struct instruction *newnode,*head,*current;

//Assembler Data structures
char *optab[] = { "STOP","ADD","SUB","MULT","MOVER","MOVEM","COMP","BC","DIV","READ","PRINT" };
char *regtab[] = { "-1","AREG","BREG","CREG","DREG" };
char *dirtab[] = { "START","END","ORIGIN","EQU","LTROG" };
char *storage[] = {"DC","DS" };
char *cc[] = {"LT","LE","EQ","GT","GE","ANY"};

int noArg;

//function to test whether a token is mnemonic
int isOptab(char *str)
{
	int i;

	for(i=0;i<11;i++)
	{
		if(strcmp(optab[i],str)==0)
		{
			return 1;
		}
	}
	return 0;	
}

//function to test whether a token is a register
int isRegtab(char *str)
{
	int i;

	for(i=0;i<5;i++)
        {       
                if(strcmp(regtab[i],str)==0)
                {       
                        return 1;
                }
        }
        return 0;
}

//function to test whether a token is a condition code
int isCC(char *str)
{       
        int i;
        
        for(i=0;i<5;i++)
        {       
                if(strcmp(cc[i],str)==0)
                {       
                        return 1;
                }
        }
        return 0;
}


//function to test whether a token is an assembler directive
int isDirtab(char *str)
{
        int i;

        for(i=0;i<4;i++)
        {
                if(strcmp(dirtab[i],str)==0)
                {
                        return 1;
                }
        }
        return 0;
}

//function to test whether a token is a declarative statement
int isStorage(char *str)
{
        int i;

        for(i=0;i<2;i++)
        {
                if(strcmp(storage[i],str)==0)
                {
                        return 1;
                }
        }
        return 0;
}
//end of condition functions




//main programs
int main(int argc,char *argv[])
{

	FILE *fp;
	char *buffer;//temporary variable to store each line
	char *t1,*t2,*t3,*t4;
	char s[2]=" ";
	int n;
	char *token;
	if(argc!=2)//Validating number of arguments
	{
		printf("Invalid number of arguments");
		exit(0);
	}
	printf("%s",argv[1]);


	fp = fopen(argv[1],"r");//open the file to read contents
	if(fp == NULL)//check for existance of a file
	{
		printf("\nFile does not exist");
		exit(0);
	}
	printf("Hello");

	//set the structure variable to NULL
	head = current = NULL;
	//start reading the file till the end of file
	while(!feof(fp))
	{
		fgets(buffer,80,fp);//read a line and storeintp buffer variable
		if(!feof(fp))
		{

			newnode=(struct instruction *)malloc(sizeof(struct instruction));//create a newnode
			newnode->next=NULL;

			strcpy(newnode->line,buffer); //copy buffer to link list node

			if(head==NULL)//check whether linked list is empty
				current=head=newnode;  //make it as a newnode
			else
				current=current->next=newnode;  //otherwise store it as next node of linked list
			printf("%s",buffer); //display buffer contents
		}
	}



	fclose(fp);

	printf("READING FROM LL\n");

	t1 = (char*)malloc(sizeof(char*));
	t2 = (char*)malloc(sizeof(char*));
	t3 = (char*)malloc(sizeof(char*));
	t4 = (char*)malloc(sizeof(char*));
	//transverse the linked list i.e diplay the file contents using linked list
	for(current = head;current; current=current->next)
	{
		printf("%s",current->line);
		strcpy(t1,"\0");
		strcpy(t2,"\0");
		strcpy(t3,"\0");
		strcpy(t4,"\0");
		
		noArg==sscanf(current->line,"%s %s %s %s",t1,t2,t3,t4);  //tokenization
		printf("t1=%s  t2=%s  t3=%s  t4=%s\n",t1,t2,t3,t4); //display tokens
		printf("\nno. of arguments=%d\n",noArg);
		//Validation of assembly statements
		if(noArg==1)
		{
			if((strcasecmp(t1,"STOP")!=0) || (strcasecmp(t1,"END")!=0) ||(strcasecmp(t1,"LTORG")!=0))
			{
				printf("\nInvalid statements\n");
			}
		}
		else if(noArg==2)
		{
			if((strcasecmp(t2,"STOP")==0) || (strcasecmp(t2,"END")==0) ||(strcasecmp(t2,"LTORG")==0))
			{
				if(isOptab(t1) || isRegtab(t1) || isDirtab(t1) || isStorage(t1) || isCC(t1))
					printf("\nInvalid label\n");
			}
			if((strcasecmp(t1,"STOP")==0) || (strcasecmp(t1,"END")==0) ||(strcasecmp(t1,"LTORG")==0) || (strcasecmp(t1,"READ")==0) || (strcasecmp(t1,"PRINT")==0))
			{
				if(isOptab(t2) || isRegtab(t2) || isDirtab(t2) || isStorage(t2) || isCC(t2))
                                        printf("\nInvalid symbol/operand\n");
                        }

		}
		else if(noArg==3)
		{
			if((strcasecmp(t2,"READ")==0) || (strcasecmp(t2,"PRINT")==0)) //if READ and PRINT then validate label (1st and 3rd operand)
			{
				 if(isOptab(t1) || isRegtab(t1) || isDirtab(t1) || isStorage(t1) || isCC(t1) || isOptab(t3) || isRegtab(t3) || isDirtab(t3) || isStorage(t3) || isCC(t3))
					 printf("\nInvalid label/symbol/n");
			}
			if((strcasecmp(t1,"MOVER")==0) || (strcasecmp(t1,"ADD")==0) ||(strcasecmp(t1,"SUB")==0) || (strcasecmp(t1,"MULT")==0) || (strcasecmp(t1,"DIV")==0)) //if READ and PRINT then validate label(1st and 3rd operand
			{
				if(isOptab(t3) || isRegtab(t3) || isDirtab(t3) || isStorage(t3) || isCC(t3))
					printf("\nInvalid label/symbol\n");
				if(!(isRegtab(t2)))  //second operand should be register
					printf("\nInvalid register\n");

			}

		}

		printf("\nNo error\n");
	}
}

