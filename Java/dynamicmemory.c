#include<stdio.h>
#include<stdlib.h>

void bubblesort(int n,int *arr);

int main()
{
	int n;
	printf("\nEnter the size of array: ");
	scanf("%d",&n);
	int *arr=(int *)calloc(n,sizeof(int));
	printf("\nEnter the elements: ");
	for(int i =0;i<n;i++)
	{
		printf("Element %d: ",(i+1));
		scanf("%d",(arr+i));
	}
	bubblesort(n,arr);
}

void bubblesort(int n, int *ar)
{
	int i,j,temp;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(*(ar+j)>*(ar+j+1))
			{
				temp=*(ar+j);
				*(ar+j)=*(ar+j+1);
				*(ar+j+1)=temp;
			}
		}
	}
	printf("\n\nSorted Array is:");
	for(i=0;i<n;i++)
        {
                printf("\nElement %d is %d ?",(i+1), *(ar+i));
        }

}
