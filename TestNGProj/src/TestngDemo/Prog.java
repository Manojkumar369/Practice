package TestngDemo;

import java.util.Arrays;

public class Prog 
{
	public static void main(String args[])
	{
int a[]= {1,3,5,0,4,2,7,9,8,6};
int temp=0;

for(int i=0;i<a.length;i++)
{
	if (a[i]!=i)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]==i)
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
}
System.out.println(Arrays.toString(a));
	}
}